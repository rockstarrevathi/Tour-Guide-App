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
public class FunFragment extends Fragment {

    public FunFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.amc_rock_name),
                getString(R.string.amc_rock_address),
                getString(R.string.not_applicable),
                getString(R.string.amc_rock_phone),
                getString(R.string.amc_rock_description),
                R.drawable.adventure_rock));

        locations.add(new Location(getString(R.string.bowling_name),
                getString(R.string.bowling_address),
                getString(R.string.not_applicable),
                getString(R.string.bowling_phone),
                getString(R.string.bowling_description),
                R.drawable.icombat));


        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
