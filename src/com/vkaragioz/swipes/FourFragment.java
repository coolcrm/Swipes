package com.vkaragioz.swipes;

import android.app.Fragment;
import android.os.Bundle;
import android.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FourFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_four, container,
				false);
		this.setRetainInstance(true);
		// Trying to add day calendar
		/*
		 * Fragment dcf = new DayCalendarFragment(); FragmentTransaction
		 * transaction = getFragmentManager() .beginTransaction(); try {
		 * transaction.add(getId(), dcf).commit(); } catch (Exception e){ // }
		 */

		return rootView;
	}

}