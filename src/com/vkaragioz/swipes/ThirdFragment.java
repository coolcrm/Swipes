package com.vkaragioz.swipes;

import com.tyczj.extendedcalendarview.ExtendedCalendarView;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ThirdFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_third, container,
				false);
		this.setRetainInstance(true); 
		ExtendedCalendarView calendar = (ExtendedCalendarView)rootView.findViewById(R.id.trainerCalendar);
		
		return rootView;
	}

}