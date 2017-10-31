package com.example.creativity.beautico.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;

import com.example.creativity.beautico.Activity.Helper;
import com.example.creativity.beautico.Adapter.GridAdapter;
import com.example.creativity.beautico.R;

/**
 * Created by Creativity on 8/2/2017.
 */

public class FragmentSalon extends Fragment {

    private String[] countryData = {"Normal Face Cleanup", "Normal Fruit face Cleanup", "D-Tan pack Face Neck", "3+ Cleanup",
            "Lotus Fruit Face Cleanup", "Anti-Tan Cleanup",
            "VLCC Tightening Cleanup", "VLCC Instaglow Cleanup", "Twachs Whitening Cleanup", "Aroma face Cleanup", "Shahnaz face Cleanup"
    };
    private String[] price_arr = {"400", "650", "800", "900", "1800", "450",
            "700", "650", "600", "750", "1800"};

    private String[] duration_arr = {"00:30", "00:40", "01:00", "00:45", "01:00", "00:30",
            "00:45", "00:40", "00:35", "00:35", "01:00"};

    private String[] facial_name = {"Fruit Facial", "Silver Facial", "Gold Facial", "Diamond Facial", "Pearl Facial", "Aroma Papaya Facial",
            "Sahanaz Diamond Facial", "Lotus WhiteGlow Instant", "VLCC Insta Glow Facial", "Advance 4 Layer Facial", "3+whitening Facial",
            "3+SeaWeed Facial", "Casmara Facial", "VLCC Anti Tan Facial", "Oxylife Facial", "Skin Tightening Facial"
    };

    private String[] facial_price = {
            "700", "850", "950", "1100",
            "700", "800", "1900", "1300",
            "1100", "2000", "2400", "2500",
            "2300", "900", "1150", "850"};

    private String[] facial_duration = {
            "01:00", "01:00", "01:00", "01:00",
            "01:00", "01:00", "01:00", "01:00",
            "01:00", "01:00", "01:00", "01:00",
            "01:00", "01:00", "01:00", "01:00",
    };

    private String[] bleach_name = {"Face Bleach", "Face & Neck", "Full Hand's Bleach", "Half Hand's Bleach",
            "Full Leg's Bleach", "Half Le's Bleach", "Foot Bleach", "Stomach Bleach", "Under Arm's", "Full Hands+Under Arm's",
            "Normal Full Body Bleach", "Gold Full Body Bleach"};


    private String[] bleach_price = {
            "250", "280", "300", "200",
            "430", "350", "150", "250",
            "100", "350", "1500", "2000"};

    private String[] bleach_duration = {
            "00:30", "00:40", "00:40", "00:30",
            "00:40", "00:30", "00:20", "00:20",
            "00:10", "00:45", "01:00", "01:00"};

    ScrollView main_scroll;

    LinearLayout gridlayout;
    LinearLayout package_id;
    LinearLayout daily_id;
    LinearLayout kids_id;
    LinearLayout wax_id;
    LinearLayout handfeet_id;
    LinearLayout hairstyl_id;
    LinearLayout spa_id;
    LinearLayout makeup_id;
    LinearLayout facial_id;
    LinearLayout haircare_id;
    LinearLayout bleech_id;
    LinearLayout skincare_id;


    LinearLayout first_l;
    LinearLayout padicure_lyout;
    LinearLayout manicure_lyout;


    ImageView img_grid1;
    ImageView img_grid;

    ImageView img_daily1;
    ImageView img_daily2;

    ImageView img_kidszone;
    ImageView img_kidszone1;

    ImageView img_waxing;
    ImageView img_waxing1;

    ImageView img_hand_feet;
    ImageView img_hand_feet1;

    ImageView img_hairstyle;
    ImageView img_hairstyle1;

    ImageView img_skincare;
    ImageView img_skincare1;


    ImageView img_bleech;
    ImageView img_bleech1;


    ImageView img_haircare;
    ImageView img_haircare1;


    ImageView img_facial;
    ImageView img_facial1;


    ImageView img_makeup;
    ImageView img_makeup1;


    ImageView img_spa;
    ImageView img_spa1;

    ListView list_item;
    ListView padicure_list;
    ListView manicure_list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.your_place_page, container, false);
        package_id = (LinearLayout) rootView.findViewById(R.id.package_id);
        daily_id = (LinearLayout) rootView.findViewById(R.id.daily_id);
        kids_id = (LinearLayout) rootView.findViewById(R.id.kids_id);
        wax_id = (LinearLayout) rootView.findViewById(R.id.wax_id);
        handfeet_id = (LinearLayout) rootView.findViewById(R.id.handfeet_id);
        hairstyl_id = (LinearLayout) rootView.findViewById(R.id.hairstyl_id);
        spa_id = (LinearLayout) rootView.findViewById(R.id.spa_id);
        makeup_id = (LinearLayout) rootView.findViewById(R.id.makeup_id);
        facial_id = (LinearLayout) rootView.findViewById(R.id.facial_id);
        haircare_id = (LinearLayout) rootView.findViewById(R.id.haircare_id);
        bleech_id = (LinearLayout) rootView.findViewById(R.id.bleech_id);
        skincare_id = (LinearLayout) rootView.findViewById(R.id.skincare_id);

        main_scroll = (ScrollView) rootView.findViewById(R.id.main_scroll);


        first_l = (LinearLayout) rootView.findViewById(R.id.first_l);
        padicure_lyout = (LinearLayout) rootView.findViewById(R.id.padicure_lyout);
        manicure_lyout = (LinearLayout) rootView.findViewById(R.id.manicure_lyout);


        img_grid1 = (ImageView) rootView.findViewById(R.id.img_grid1);
        img_grid = (ImageView) rootView.findViewById(R.id.img_grid);


        img_daily1 = (ImageView) rootView.findViewById(R.id.img_daily1);
        img_daily2 = (ImageView) rootView.findViewById(R.id.img_daily2);

        img_kidszone = (ImageView) rootView.findViewById(R.id.img_kidszone);
        img_kidszone1 = (ImageView) rootView.findViewById(R.id.img_kidszone1);

        img_skincare = (ImageView) rootView.findViewById(R.id.img_skincare);
        img_skincare1 = (ImageView) rootView.findViewById(R.id.img_skincare1);

        img_bleech = (ImageView) rootView.findViewById(R.id.img_bleech);
        img_bleech1 = (ImageView) rootView.findViewById(R.id.img_bleech1);

        img_haircare = (ImageView) rootView.findViewById(R.id.img_haircare);
        img_haircare1 = (ImageView) rootView.findViewById(R.id.img_haircare1);

        img_facial = (ImageView) rootView.findViewById(R.id.img_facial);
        img_facial1 = (ImageView) rootView.findViewById(R.id.img_facial1);

        img_makeup = (ImageView) rootView.findViewById(R.id.img_makeup);
        img_makeup1 = (ImageView) rootView.findViewById(R.id.img_makeup1);

        img_spa = (ImageView) rootView.findViewById(R.id.img_spa);
        img_spa1 = (ImageView) rootView.findViewById(R.id.img_spa1);

        img_waxing = (ImageView) rootView.findViewById(R.id.img_waxing);
        img_waxing1 = (ImageView) rootView.findViewById(R.id.img_waxing1);

        img_hand_feet = (ImageView) rootView.findViewById(R.id.img_hand_feet);
        img_hand_feet1 = (ImageView) rootView.findViewById(R.id.img_hand_feet1);

        img_hairstyle = (ImageView) rootView.findViewById(R.id.img_hairstyle);
        img_hairstyle1 = (ImageView) rootView.findViewById(R.id.img_hairstyle1);


        list_item = (ListView) rootView.findViewById(R.id.list_item);
        padicure_list = (ListView) rootView.findViewById(R.id.padicure_list);
        manicure_list = (ListView) rootView.findViewById(R.id.manicure_list);

//-------------------------------------------click row one------------------------------------------------------------------------------
        package_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GridAdapter adapter = new GridAdapter(getActivity(), countryData, price_arr, duration_arr);
                list_item.setAdapter(adapter);
                Helper.getListViewSize(list_item);


/*
                main_scroll.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {

                        return true;
                    }
                });
*/

                first_l.setVisibility(View.VISIBLE);
                padicure_lyout.setVisibility(View.GONE);
                manicure_lyout.setVisibility(View.GONE);

                img_grid1.setVisibility(View.VISIBLE);
                img_grid.setVisibility(View.GONE);
//                img_grid1.setVisibility(View.GONE);
                img_daily2.setVisibility(View.GONE);
                img_kidszone1.setVisibility(View.GONE);
                img_waxing1.setVisibility(View.GONE);
                img_hand_feet1.setVisibility(View.GONE);
                img_hairstyle1.setVisibility(View.GONE);
                img_spa1.setVisibility(View.GONE);
                img_makeup1.setVisibility(View.GONE);
                img_facial1.setVisibility(View.GONE);
                img_haircare1.setVisibility(View.GONE);
                img_bleech1.setVisibility(View.GONE);
                img_skincare1.setVisibility(View.GONE);


//                img_grid1.setVisibility(View.VISIBLE);
                img_daily1.setVisibility(View.VISIBLE);
                img_kidszone.setVisibility(View.VISIBLE);
                img_waxing.setVisibility(View.VISIBLE);
                img_hand_feet.setVisibility(View.VISIBLE);
                img_hairstyle.setVisibility(View.VISIBLE);
                img_spa.setVisibility(View.VISIBLE);
                img_makeup.setVisibility(View.VISIBLE);
                img_facial.setVisibility(View.VISIBLE);
                img_haircare.setVisibility(View.VISIBLE);
                img_bleech.setVisibility(View.VISIBLE);
                img_skincare.setVisibility(View.VISIBLE);


            }
        });
        img_grid1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_l.setVisibility(View.GONE);
                img_grid.setVisibility(View.VISIBLE);
                img_grid1.setVisibility(View.GONE);
            }
        });

        daily_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GridAdapter adapter2 = new GridAdapter(getActivity(), facial_name, facial_price, facial_duration);
                padicure_list.setAdapter(adapter2);
                Helper.getListViewSize(padicure_list);

                first_l.setVisibility(View.GONE);
                padicure_lyout.setVisibility(View.VISIBLE);
                manicure_lyout.setVisibility(View.GONE);


                img_daily1.setVisibility(View.GONE);
                img_daily2.setVisibility(View.VISIBLE);

//                img_daily2.setVisibility(View.GONE);

                img_grid1.setVisibility(View.GONE);
                img_kidszone1.setVisibility(View.GONE);
                img_waxing1.setVisibility(View.GONE);
                img_hand_feet1.setVisibility(View.GONE);
                img_hairstyle1.setVisibility(View.GONE);
                img_spa1.setVisibility(View.GONE);
                img_makeup1.setVisibility(View.GONE);
                img_facial1.setVisibility(View.GONE);
                img_haircare1.setVisibility(View.GONE);
                img_bleech1.setVisibility(View.GONE);
                img_skincare1.setVisibility(View.GONE);

                img_grid.setVisibility(View.VISIBLE);
//                img_daily2.setVisibility(View.VISIBLE);
                img_kidszone.setVisibility(View.VISIBLE);
                img_waxing.setVisibility(View.VISIBLE);
                img_hand_feet.setVisibility(View.VISIBLE);
                img_hairstyle.setVisibility(View.VISIBLE);
                img_spa.setVisibility(View.VISIBLE);
                img_makeup.setVisibility(View.VISIBLE);
                img_facial.setVisibility(View.VISIBLE);
                img_haircare.setVisibility(View.VISIBLE);
                img_bleech.setVisibility(View.VISIBLE);
                img_skincare.setVisibility(View.VISIBLE);


            }
        });
        img_daily2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                padicure_lyout.setVisibility(View.GONE);
                img_daily1.setVisibility(View.VISIBLE);
                img_daily2.setVisibility(View.GONE);
            }
        });

        kids_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                GridAdapter adapter3 = new GridAdapter(getActivity(), bleach_name, bleach_price, bleach_duration);
                manicure_list.setAdapter(adapter3);
                Helper.getListViewSize(manicure_list);


                first_l.setVisibility(View.GONE);
                padicure_lyout.setVisibility(View.GONE);
                manicure_lyout.setVisibility(View.VISIBLE);


                img_kidszone.setVisibility(View.GONE);
                img_kidszone1.setVisibility(View.VISIBLE);


//                img_kidszone1.setVisibility(View.GONE);
                img_daily2.setVisibility(View.GONE);
                img_grid1.setVisibility(View.GONE);
                img_waxing1.setVisibility(View.GONE);
                img_hand_feet1.setVisibility(View.GONE);
                img_hairstyle1.setVisibility(View.GONE);
                img_spa1.setVisibility(View.GONE);
                img_makeup1.setVisibility(View.GONE);
                img_facial1.setVisibility(View.GONE);
                img_haircare1.setVisibility(View.GONE);
                img_bleech1.setVisibility(View.GONE);
                img_skincare1.setVisibility(View.GONE);


                img_grid.setVisibility(View.VISIBLE);
                img_daily1.setVisibility(View.VISIBLE);
//                img_kidszone.setVisibility(View.VISIBLE);
                img_waxing.setVisibility(View.VISIBLE);
                img_hand_feet.setVisibility(View.VISIBLE);
                img_hairstyle.setVisibility(View.VISIBLE);
                img_spa.setVisibility(View.VISIBLE);
                img_makeup.setVisibility(View.VISIBLE);
                img_facial.setVisibility(View.VISIBLE);
                img_haircare.setVisibility(View.VISIBLE);
                img_bleech.setVisibility(View.VISIBLE);
                img_skincare.setVisibility(View.VISIBLE);


            }
        });
        img_kidszone1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manicure_lyout.setVisibility(View.GONE);

                img_kidszone.setVisibility(View.VISIBLE);
                img_kidszone1.setVisibility(View.GONE);
            }
        });
//-------------------------------------------click--------------------------------------------------------------------------------------

// -------------------------------------------click row two------------------------------------------------------------------------------
        wax_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                first_l.setVisibility(View.GONE);
                padicure_lyout.setVisibility(View.GONE);
                manicure_lyout.setVisibility(View.GONE);

//                first_l.setVisibility(View.VISIBLE);
                img_waxing1.setVisibility(View.VISIBLE);
                img_waxing.setVisibility(View.GONE);


                img_daily2.setVisibility(View.GONE);


                img_grid1.setVisibility(View.GONE);
                img_kidszone1.setVisibility(View.GONE);
//                img_waxing1.setVisibility(View.GONE);
                img_hand_feet1.setVisibility(View.GONE);
                img_hairstyle1.setVisibility(View.GONE);
                img_spa1.setVisibility(View.GONE);
                img_makeup1.setVisibility(View.GONE);
                img_facial1.setVisibility(View.GONE);
                img_haircare1.setVisibility(View.GONE);
                img_bleech1.setVisibility(View.GONE);
                img_skincare1.setVisibility(View.GONE);


                img_grid.setVisibility(View.VISIBLE);
                img_daily1.setVisibility(View.VISIBLE);
                img_kidszone.setVisibility(View.VISIBLE);
//                img_waxing.setVisibility(View.VISIBLE);
                img_hand_feet.setVisibility(View.VISIBLE);
                img_hairstyle.setVisibility(View.VISIBLE);
                img_spa.setVisibility(View.VISIBLE);
                img_makeup.setVisibility(View.VISIBLE);
                img_facial.setVisibility(View.VISIBLE);
                img_haircare.setVisibility(View.VISIBLE);
                img_bleech.setVisibility(View.VISIBLE);
                img_skincare.setVisibility(View.VISIBLE);

            }
        });
        img_waxing1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                first_l.setVisibility(View.GONE);
                img_waxing.setVisibility(View.VISIBLE);
                img_waxing1.setVisibility(View.GONE);
            }
        });

        handfeet_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first_l.setVisibility(View.GONE);
                padicure_lyout.setVisibility(View.GONE);
                manicure_lyout.setVisibility(View.GONE);

                img_hand_feet.setVisibility(View.GONE);
                img_hand_feet1.setVisibility(View.VISIBLE);


                img_daily2.setVisibility(View.GONE);


                img_grid1.setVisibility(View.GONE);
                img_kidszone1.setVisibility(View.GONE);
                img_waxing1.setVisibility(View.GONE);
//                img_hand_feet1.setVisibility(View.GONE);
                img_hairstyle1.setVisibility(View.GONE);
                img_spa1.setVisibility(View.GONE);
                img_makeup1.setVisibility(View.GONE);
                img_facial1.setVisibility(View.GONE);
                img_haircare1.setVisibility(View.GONE);
                img_bleech1.setVisibility(View.GONE);
                img_skincare1.setVisibility(View.GONE);

                img_grid.setVisibility(View.VISIBLE);
                img_daily1.setVisibility(View.VISIBLE);
                img_kidszone.setVisibility(View.VISIBLE);
                img_waxing.setVisibility(View.VISIBLE);
//                img_hand_feet.setVisibility(View.VISIBLE);
                img_hairstyle.setVisibility(View.VISIBLE);
                img_spa.setVisibility(View.VISIBLE);
                img_makeup.setVisibility(View.VISIBLE);
                img_facial.setVisibility(View.VISIBLE);
                img_haircare.setVisibility(View.VISIBLE);
                img_bleech.setVisibility(View.VISIBLE);
                img_skincare.setVisibility(View.VISIBLE);

            }
        });
        img_hand_feet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_hand_feet.setVisibility(View.VISIBLE);
                img_hand_feet1.setVisibility(View.GONE);
            }
        });

        hairstyl_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first_l.setVisibility(View.GONE);
                padicure_lyout.setVisibility(View.GONE);
                manicure_lyout.setVisibility(View.GONE);

                img_hairstyle.setVisibility(View.GONE);
                img_hairstyle1.setVisibility(View.VISIBLE);


                img_daily2.setVisibility(View.GONE);


                img_grid1.setVisibility(View.GONE);
                img_kidszone1.setVisibility(View.GONE);
                img_waxing1.setVisibility(View.GONE);
                img_hand_feet1.setVisibility(View.GONE);
//                img_hairstyle1.setVisibility(View.GONE);
                img_spa1.setVisibility(View.GONE);
                img_makeup1.setVisibility(View.GONE);
                img_facial1.setVisibility(View.GONE);
                img_haircare1.setVisibility(View.GONE);
                img_bleech1.setVisibility(View.GONE);
                img_skincare1.setVisibility(View.GONE);


                img_grid.setVisibility(View.VISIBLE);
                img_daily1.setVisibility(View.VISIBLE);
                img_kidszone.setVisibility(View.VISIBLE);
                img_waxing.setVisibility(View.VISIBLE);
                img_hand_feet.setVisibility(View.VISIBLE);
//                img_hairstyle.setVisibility(View.VISIBLE);
                img_spa.setVisibility(View.VISIBLE);
                img_makeup.setVisibility(View.VISIBLE);
                img_facial.setVisibility(View.VISIBLE);
                img_haircare.setVisibility(View.VISIBLE);
                img_bleech.setVisibility(View.VISIBLE);
                img_skincare.setVisibility(View.VISIBLE);
            }
        });
        img_hairstyle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_hairstyle.setVisibility(View.VISIBLE);
                img_hairstyle1.setVisibility(View.GONE);
            }
        });


//-------------------------------------------click----------------------------------------------------------------------------------------
// -------------------------------------------click row three------------------------------------------------------------------------------
        spa_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first_l.setVisibility(View.GONE);
                padicure_lyout.setVisibility(View.GONE);
                manicure_lyout.setVisibility(View.GONE);

//                first_l.setVisibility(View.VISIBLE);
                img_spa1.setVisibility(View.VISIBLE);
                img_spa.setVisibility(View.GONE);


                img_daily2.setVisibility(View.GONE);


                img_grid1.setVisibility(View.GONE);
                img_kidszone1.setVisibility(View.GONE);
                img_waxing1.setVisibility(View.GONE);
                img_hand_feet1.setVisibility(View.GONE);
                img_hairstyle1.setVisibility(View.GONE);
//                img_spa1.setVisibility(View.GONE);
                img_makeup1.setVisibility(View.GONE);
                img_facial1.setVisibility(View.GONE);
                img_haircare1.setVisibility(View.GONE);
                img_bleech1.setVisibility(View.GONE);
                img_skincare1.setVisibility(View.GONE);

                img_grid.setVisibility(View.VISIBLE);
                img_daily1.setVisibility(View.VISIBLE);
                img_kidszone.setVisibility(View.VISIBLE);
                img_waxing.setVisibility(View.VISIBLE);
                img_hand_feet.setVisibility(View.VISIBLE);
                img_hairstyle.setVisibility(View.VISIBLE);
//                img_spa.setVisibility(View.VISIBLE);
                img_makeup.setVisibility(View.VISIBLE);
                img_facial.setVisibility(View.VISIBLE);
                img_haircare.setVisibility(View.VISIBLE);
                img_bleech.setVisibility(View.VISIBLE);
                img_skincare.setVisibility(View.VISIBLE);

            }
        });
        img_spa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                first_l.setVisibility(View.GONE);
                img_spa.setVisibility(View.VISIBLE);
                img_spa1.setVisibility(View.GONE);
            }
        });

        makeup_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first_l.setVisibility(View.GONE);
                padicure_lyout.setVisibility(View.GONE);
                manicure_lyout.setVisibility(View.GONE);

                img_makeup.setVisibility(View.GONE);
                img_makeup1.setVisibility(View.VISIBLE);


                img_daily2.setVisibility(View.GONE);


                img_grid1.setVisibility(View.GONE);
                img_kidszone1.setVisibility(View.GONE);
                img_waxing1.setVisibility(View.GONE);
                img_hand_feet1.setVisibility(View.GONE);
                img_hairstyle1.setVisibility(View.GONE);
                img_spa1.setVisibility(View.GONE);
//                img_makeup1.setVisibility(View.GONE);
                img_facial1.setVisibility(View.GONE);
                img_haircare1.setVisibility(View.GONE);
                img_bleech1.setVisibility(View.GONE);
                img_skincare1.setVisibility(View.GONE);

                img_grid.setVisibility(View.VISIBLE);
                img_daily1.setVisibility(View.VISIBLE);
                img_kidszone.setVisibility(View.VISIBLE);
                img_waxing.setVisibility(View.VISIBLE);
                img_hand_feet.setVisibility(View.VISIBLE);
                img_hairstyle.setVisibility(View.VISIBLE);
                img_spa.setVisibility(View.VISIBLE);
//                img_makeup.setVisibility(View.VISIBLE);
                img_facial.setVisibility(View.VISIBLE);
                img_haircare.setVisibility(View.VISIBLE);
                img_bleech.setVisibility(View.VISIBLE);
                img_skincare.setVisibility(View.VISIBLE);

            }
        });
        img_makeup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_makeup.setVisibility(View.VISIBLE);
                img_makeup1.setVisibility(View.GONE);
            }
        });

        facial_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_l.setVisibility(View.GONE);
                padicure_lyout.setVisibility(View.GONE);
                manicure_lyout.setVisibility(View.GONE);

                img_facial.setVisibility(View.GONE);
                img_facial1.setVisibility(View.VISIBLE);


                img_daily2.setVisibility(View.GONE);


                img_grid1.setVisibility(View.GONE);
                img_kidszone1.setVisibility(View.GONE);
                img_waxing1.setVisibility(View.GONE);
                img_hand_feet1.setVisibility(View.GONE);
                img_hairstyle1.setVisibility(View.GONE);
                img_spa1.setVisibility(View.GONE);
                img_makeup1.setVisibility(View.GONE);
//                img_facial1.setVisibility(View.GONE);
                img_haircare1.setVisibility(View.GONE);
                img_bleech1.setVisibility(View.GONE);
                img_skincare1.setVisibility(View.GONE);


                img_grid.setVisibility(View.VISIBLE);
                img_daily1.setVisibility(View.VISIBLE);
                img_kidszone.setVisibility(View.VISIBLE);
                img_waxing.setVisibility(View.VISIBLE);
                img_hand_feet.setVisibility(View.VISIBLE);
                img_hairstyle.setVisibility(View.VISIBLE);
                img_spa.setVisibility(View.VISIBLE);
                img_makeup.setVisibility(View.VISIBLE);
//                img_facial.setVisibility(View.VISIBLE);
                img_haircare.setVisibility(View.VISIBLE);
                img_bleech.setVisibility(View.VISIBLE);
                img_skincare.setVisibility(View.VISIBLE);

            }
        });
        img_facial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_facial.setVisibility(View.VISIBLE);
                img_facial1.setVisibility(View.GONE);
            }
        });


//-------------------------------------------click----------------------------------------------------------------------------------------
// -------------------------------------------click row four------------------------------------------------------------------------------
        haircare_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first_l.setVisibility(View.GONE);
                padicure_lyout.setVisibility(View.GONE);
                manicure_lyout.setVisibility(View.GONE);

//                first_l.setVisibility(View.VISIBLE);
                img_haircare1.setVisibility(View.VISIBLE);
                img_haircare.setVisibility(View.GONE);


                img_daily2.setVisibility(View.GONE);
                img_grid1.setVisibility(View.GONE);
                img_kidszone1.setVisibility(View.GONE);
                img_waxing1.setVisibility(View.GONE);
                img_hand_feet1.setVisibility(View.GONE);
                img_hairstyle1.setVisibility(View.GONE);
                img_spa1.setVisibility(View.GONE);
                img_makeup1.setVisibility(View.GONE);
                img_facial1.setVisibility(View.GONE);
//                img_haircare1.setVisibility(View.GONE);
                img_bleech1.setVisibility(View.GONE);
                img_skincare1.setVisibility(View.GONE);


                img_grid.setVisibility(View.VISIBLE);
                img_daily1.setVisibility(View.VISIBLE);
                img_kidszone.setVisibility(View.VISIBLE);
                img_waxing.setVisibility(View.VISIBLE);
                img_hand_feet.setVisibility(View.VISIBLE);
                img_hairstyle.setVisibility(View.VISIBLE);
                img_spa.setVisibility(View.VISIBLE);
                img_makeup.setVisibility(View.VISIBLE);
                img_facial.setVisibility(View.VISIBLE);
//                img_haircare.setVisibility(View.VISIBLE);
                img_bleech.setVisibility(View.VISIBLE);
                img_skincare.setVisibility(View.VISIBLE);
            }
        });
        img_haircare1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                first_l.setVisibility(View.GONE);
                img_haircare.setVisibility(View.VISIBLE);
                img_haircare1.setVisibility(View.GONE);
            }
        });

        bleech_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first_l.setVisibility(View.GONE);
                padicure_lyout.setVisibility(View.GONE);
                manicure_lyout.setVisibility(View.GONE);

                img_bleech.setVisibility(View.GONE);
                img_bleech1.setVisibility(View.VISIBLE);


                img_daily2.setVisibility(View.GONE);
                img_grid1.setVisibility(View.GONE);
                img_kidszone1.setVisibility(View.GONE);
                img_waxing1.setVisibility(View.GONE);
                img_hand_feet1.setVisibility(View.GONE);
                img_hairstyle1.setVisibility(View.GONE);
                img_spa1.setVisibility(View.GONE);
                img_makeup1.setVisibility(View.GONE);
                img_facial1.setVisibility(View.GONE);
                img_haircare1.setVisibility(View.GONE);
//                img_bleech1.setVisibility(View.GONE);
                img_skincare1.setVisibility(View.GONE);


                img_grid.setVisibility(View.VISIBLE);
                img_daily1.setVisibility(View.VISIBLE);
                img_kidszone.setVisibility(View.VISIBLE);
                img_waxing.setVisibility(View.VISIBLE);
                img_hand_feet.setVisibility(View.VISIBLE);
                img_hairstyle.setVisibility(View.VISIBLE);
                img_spa.setVisibility(View.VISIBLE);
                img_makeup.setVisibility(View.VISIBLE);
                img_facial.setVisibility(View.VISIBLE);
                img_haircare.setVisibility(View.VISIBLE);
//                img_bleech.setVisibility(View.VISIBLE);
                img_skincare.setVisibility(View.VISIBLE);

            }
        });
        img_bleech1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_bleech.setVisibility(View.VISIBLE);
                img_bleech1.setVisibility(View.GONE);
            }
        });

        skincare_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first_l.setVisibility(View.GONE);
                padicure_lyout.setVisibility(View.GONE);
                manicure_lyout.setVisibility(View.GONE);

                img_skincare.setVisibility(View.GONE);
                img_skincare1.setVisibility(View.VISIBLE);

                img_daily2.setVisibility(View.GONE);
                img_grid1.setVisibility(View.GONE);
                img_kidszone1.setVisibility(View.GONE);
                img_waxing1.setVisibility(View.GONE);
                img_hand_feet1.setVisibility(View.GONE);
                img_hairstyle1.setVisibility(View.GONE);
                img_spa1.setVisibility(View.GONE);
                img_makeup1.setVisibility(View.GONE);
                img_facial1.setVisibility(View.GONE);
                img_haircare1.setVisibility(View.GONE);
                img_bleech1.setVisibility(View.GONE);
//                img_skincare1.setVisibility(View.GONE);


                img_grid.setVisibility(View.VISIBLE);
                img_daily1.setVisibility(View.VISIBLE);
                img_kidszone.setVisibility(View.VISIBLE);
                img_waxing.setVisibility(View.VISIBLE);
                img_hand_feet.setVisibility(View.VISIBLE);
                img_hairstyle.setVisibility(View.VISIBLE);
                img_spa.setVisibility(View.VISIBLE);
                img_makeup.setVisibility(View.VISIBLE);
                img_facial.setVisibility(View.VISIBLE);
                img_haircare.setVisibility(View.VISIBLE);
                img_bleech.setVisibility(View.VISIBLE);
//                img_skincare.setVisibility(View.VISIBLE);

            }
        });
        img_skincare1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_skincare.setVisibility(View.VISIBLE);
                img_skincare1.setVisibility(View.GONE);
            }
        });


//-------------------------------------------click----------------------------------------------------------------------------------------

//-------------------------------------------scroll ListView------------------------------------------------------------------------------
        list_item.setOnTouchListener(new ListView.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }

                // Handle ListView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });
        padicure_list.setOnTouchListener(new ListView.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }

                // Handle ListView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });
        manicure_list.setOnTouchListener(new ListView.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }

                // Handle ListView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });
//-------------------------------------------scroll ListView------------------------------------------------------------------------------

/*
        GridView gridView = (GridView) rootView.findViewById(R.id.gridView);
        gridlayout = (LinearLayout) rootView.findViewById(R.id.gridlayout);
        gridView.setAlpha((float) .6);

//        gridlayout.setAlpha((float) 0.4);
//        Instance of ImageAdapter Class
        gridView.setAdapter(new GridAdapter(getActivity()));*/

        return rootView;
    }
}
