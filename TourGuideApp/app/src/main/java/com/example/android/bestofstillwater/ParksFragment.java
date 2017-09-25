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
public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Add all of the Park locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.boomer_park_name),
                getString(R.string.boomer_park_address),
                getString(R.string.boomer_park_hours),
                getString(R.string.boomer_park_phone),
                getString(R.string.boomer_park_description),
                R.drawable.lapham_peak));

        locations.add(new Location(getString(R.string.strickland_park_name),
                getString(R.string.strickland_park_address),
                getString(R.string.strickland_park_hours),
                getString(R.string.not_applicable),
                getString(R.string.strickland_park_description),
                R.drawable.frame_park));


        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
