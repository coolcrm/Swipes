package com.vkaragioz.swipes;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */

/**
 * A placeholder fragment containing a simple view.
 */

public class PlaceholderFragment extends Fragment {

	private GoogleMap googleMap;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container,
				false);

		this.setRetainInstance(true);
		MapFragment f = (MapFragment) getFragmentManager().findFragmentById(
				R.id.map);
		f.setRetainInstance(true);
		// Add something to the map
		initilizeMap();
		// latitude and longitude
		double latitude = 20;
		double longitude = 0;
		 
		// create marker
		MarkerOptions marker = new MarkerOptions().position(new LatLng(latitude, longitude)).title("Hello Maps ");
		 
		// adding marker
		googleMap.addMarker(marker);
		/*
		 * TextView textView = (TextView) rootView
		 * .findViewById(R.id.section_label);
		 * textView.setText(Integer.toString(getArguments().getInt(
		 * ARG_SECTION_NUMBER)));
		 */
		Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner_city);
		// Create an ArrayAdapter using the string array and a default spinner
		// layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				getActivity().getBaseContext(), R.array.cities_array,
				android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner.setAdapter(adapter);
		return rootView;
	}

	// See here
	// http://stackoverflow.com/questions/14074625/mapfragment-in-action-bar-tabs
	@Override
	public void onDestroyView() {
		super.onDestroyView();

		MapFragment f = (MapFragment) getFragmentManager().findFragmentById(
				R.id.map);
		if (f != null)
			getFragmentManager().beginTransaction().remove(f).commit();

	}
	 /**
     * function to load map. If map is not created it will create it for you
     * */
    private void initilizeMap() {
        if (googleMap == null) {
            googleMap = ((MapFragment) getFragmentManager().findFragmentById(
                    R.id.map)).getMap();
 
            // check if map is created successfully or not
            if (googleMap == null) {
                Toast.makeText(getActivity(),
                        "Sorry! unable to create maps", Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }
}