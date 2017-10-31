package com.example.creativity.beautico.Adapter;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.creativity.beautico.Fragment.Fragment_BookNow;
import com.example.creativity.beautico.R;

import java.util.ArrayList;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;


/**
 * Created by Creativity on 8/2/2017.
 */

public class GridAdapter extends BaseAdapter {


    private String[] countryData;
    private String[] price_arr;
    private String[] duration_arr;
    private int counter = 0;
    int temp = 0;

    ArrayList<String> product_list = new ArrayList<>();

    int[] img = {R.drawable.packages, R.drawable.daily,
            R.drawable.kids, R.drawable.wax,
            R.drawable.hand, R.drawable.hair,
            R.drawable.spa, R.drawable.bleech,
            R.drawable.facial, R.drawable.hair,
            R.drawable.wax, R.drawable.facial
    };
    private Context mContext;
    holder holder = new holder();

    public GridAdapter(Context mContext, String[] countryData, String[] price_arr, String[] duration_arr) {
        this.countryData = countryData;
        this.price_arr = price_arr;
        this.duration_arr = duration_arr;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return countryData.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_grid, parent, false);
        }

        holder.duration_id = (TextView) convertView.findViewById(R.id.duration_id);
        holder.item_id = (TextView) convertView.findViewById(R.id.item_id);
        holder.price_id = (TextView) convertView.findViewById(R.id.price_id);
        holder.img_info = (ImageView) convertView.findViewById(R.id.img_info);
        holder.img_add = (ImageView) convertView.findViewById(R.id.img_add);
        holder.img_minus = (ImageView) convertView.findViewById(R.id.img_minus);

        holder.layout_list = (LinearLayout) convertView.findViewById(R.id.layout_list);


        holder.item_id.setText(countryData[position]);
        holder.duration_id.setText("Duration:" + duration_arr[position]);
        holder.price_id.setText("$" + price_arr[position]);

/*        holder.childlayout = (LinearLayout) convertView.findViewById(R.id.childlayout);
        holder.newlayout = (LinearLayout) convertView.findViewById(R.id.newlayout);*/
//        holder.img_grid.setAlpha((float) 0.3);

/*
        holder.textG.setBackgroundColor(Color.TRANSPARENT);
        holder.img_grid.setBackgroundColor(Color.TRANSPARENT);
*/


        holder.img_add.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {

                counter += 1;
                product_list.add(countryData[position]);
                holder.img_minus.setVisibility(View.VISIBLE);
                holder.img_add.setVisibility(View.GONE);

                notifyDataSetChanged();

                Toast.makeText(mContext, "postion " + position, Toast.LENGTH_SHORT).show();
                Snackbar snackbar = Snackbar.make(v, "Book Now", Snackbar.LENGTH_LONG);
                snackbar.setActionTextColor(v.getResources().getColor(R.color.colorAccent));
                snackbar.getView().setBackgroundColor(v.getResources().getColor(R.color.colorAccent));
                snackbar.getView().setTextAlignment(Gravity.CENTER);

                snackbar.setAction("click", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), "Number of Product=" + counter, Toast.LENGTH_SHORT).show();
                        Toast.makeText(v.getContext(), "Product Name=" + product_list, Toast.LENGTH_SHORT).show();
                    }
                });

                snackbar.show();


//                Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();

            }
        });


        holder.img_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.img_minus.setVisibility(View.GONE);
                holder.img_add.setVisibility(View.VISIBLE);
                notifyDataSetChanged();

            }
        });
        holder.img_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder2 = new android.support.v7.app.AlertDialog.Builder(v.getContext());
//                    builder2.setTitle("Product Details");
                LayoutInflater layout = (LayoutInflater) v.getContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                final View dialogView = layout.inflate(R.layout.info_layout, null);


//                contactperson = (TextView) dialogView.findViewById(R.id.contactperson);
//                contactnumber = (TextView) dialogView.findViewById(R.id.contactnumber);
//                contactaddress = (TextView) dialogView.findViewById(R.id.contactaddress);


                builder2.setView(dialogView);
                builder2.show();
            }
        });
        holder.layout_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String product_name = countryData[position];
                String product_price = price_arr[position];
                String product_duraion = duration_arr[position];

                getInfo(product_name, product_price, product_duraion);

            }
        });

        return convertView;
    }

    public void getInfo(final String product_name, final String product_price, final String product_duraion) {

        Log.i("product_Name", String.valueOf(product_name));
        Log.i("product_price", String.valueOf(product_price));
        Log.i("product_dur", String.valueOf(product_duraion));
        int price = Integer.parseInt(product_price);
        temp = temp + price;

        Toast.makeText(mContext, "Price=" + temp, Toast.LENGTH_SHORT).show();


    }

    public void getfrag() {
        FragmentManager mFragmentManager;
        FragmentTransaction mFragmentTransaction;
        Fragment_BookNow fm3 = new Fragment_BookNow();


    }

    class holder {
        TextView item_id;
        TextView price_id;
        TextView duration_id;

        LinearLayout layout_list;

        ImageView img_info;
        ImageView img_add;
        ImageView img_minus;
    }
}
