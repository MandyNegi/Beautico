package com.example.creativity.beautico.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.creativity.beautico.Adapter.Salon_List;
import com.example.creativity.beautico.R;

//import com.zhongzewei.widget.ExpandableGridView;


/**
 * Created by Creativity on 8/2/2017.
 */

public class FragmentYourPlace extends Fragment {
    ListView salon_list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        View rootView = inflater.inflate(R.layout.fragmentyour_place, container, false);
        View rootView = inflater.inflate(R.layout.stitching_layout, container, false);


        String[] name_arr = {"China", "USA", "UK", "Russia", "France", "Germany", "Japan", "Korea", "Canada", "India"};
        String[] address_arr = {"State A", "State B", "State C", "State D", "State D",
                "State D", "State D", "State D", "State D", "State D"};

/*
        salon_list = (ListView) rootView.findViewById(R.id.salon_list);
        Salon_List adapter = new Salon_List(getActivity(), name_arr, address_arr);
        salon_list.setAdapter(adapter);

*/

/*        // 0.Init the ExpandableGridView
        final ExpandableGridView countryGridView = (ExpandableGridView) rootView.findViewById(R.id.country_grid);
        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(getActivity(), R.layout.grid_item, R.id.grid_item, countryData);
        // 1.Set adapter for the grid view
        countryGridView.setAdapter(countryAdapter);
        // 2.Add click event listener to the grid view, expand grid view when item is clicked
        countryGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // expand the grid view

                Toast.makeText(getActivity(), "Button Pressed", Toast.LENGTH_SHORT).show();
                countryGridView.expandGridViewAtView(view, new ArrayAdapter<String>(getActivity(),
                        R.layout.grid_item, R.id.grid_item, stateData));
            }
        });
        // 3.Click event listener of sub GridView items
        countryGridView.setOnExpandItemClickListener(new ExpandableGridView.OnExpandItemClickListener() {
            @Override
            public void onItemClick(int position, Object clickPositionData) {
                Toast.makeText(getActivity(), clickPositionData.toString() + " clicked", Toast.LENGTH_LONG).show();
            }
        });*/


        return rootView;
    }


}
