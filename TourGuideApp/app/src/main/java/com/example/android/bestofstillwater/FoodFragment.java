package com.example.android.bestofstillwater;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.louie_name),
                getString(R.string.louie_address),
                getString(R.string.not_applicable),
                getString(R.string.louie_phone),
                getString(R.string.louie_description),
                R.drawable.joses_blue_sombrero));

        locations.add(new Location(getString(R.string.texas_name),
                getString(R.string.texas_address),
                getString(R.string.not_applicable),
                getString(R.string.texas_phone),
                getString(R.string.texas_description),
                R.drawable.bravo_italian));


        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
