package com.example.creativity.beautico.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.creativity.beautico.R;

/**
 * Created by Creativity on 8/9/2017.
 */

public class Salon_List extends BaseAdapter {

    String[] name_arr;
    String[] address_arr;
    Context c;

    public Salon_List(Context c,String[] name_arr, String[] address_arr) {
        this.name_arr = name_arr;
        this.address_arr = address_arr;
        this.c = c;
    }

    @Override

    public int getCount() {
        return name_arr.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.salon_child, parent, false);
        }
        holder1 holder = new holder1();

        holder.name_prlr = (TextView) convertView.findViewById(R.id.name_prlr);
        holder.add_prlr = (TextView) convertView.findViewById(R.id.add_prlr);


        holder.name_prlr.setText(name_arr[position]);
        holder.add_prlr.setText(address_arr[position]);
        return convertView;
    }

    class holder1 {
        TextView name_prlr;
        TextView add_prlr;
    }


}
