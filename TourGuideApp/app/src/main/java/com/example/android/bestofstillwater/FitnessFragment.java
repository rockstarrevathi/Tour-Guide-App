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
public class FitnessFragment extends Fragment {

    public FitnessFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();

        locations.add(new Location(getString(R.string.gymone_name),
                getString(R.string.gymone_address),
                getString(R.string.not_applicable),
                getString(R.string.gymone_phone),
                getString(R.string.gymone_description),
                R.drawable.center_court));

        locations.add(new Location(getString(R.string.youth_name),
                getString(R.string.youth_address),
                getString(R.string.not_applicable),
                getString(R.string.youth_phone),
                getString(R.string.gymone_description),
                R.drawable.mixed_martial_arts));

        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
