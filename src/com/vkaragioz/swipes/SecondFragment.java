package com.vkaragioz.swipes;

import java.util.ArrayList;

import com.vkaragioz.swipes.adapter.TrainerListAdapter;

import android.os.Bundle;
import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class SecondFragment extends Fragment {
	ArrayList prgmName;
	public static int[] prgmImages = { R.drawable.i, R.drawable.i1,
			R.drawable.i2, R.drawable.i3, R.drawable.i4,
			R.drawable.i5, R.drawable.i6, R.drawable.i7,
			R.drawable.i8 };
	public static String[] prgmNameList = { "Алексей Васютин", "Линар Ивашов", "Алла Удальцова", "Анатолий Бочаров",
			"Михаил Пургин","Анна Тост",  "Петр Станев", "Олег Царёв", "Геннадий Водянов" };
	ListView lv;

	// Context context;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_second, container,
				false);
		this.setRetainInstance(true);

		// context=this;

		try {
			lv = (ListView) ((ViewGroup) rootView).getChildAt(5);
			lv.setAdapter(new TrainerListAdapter(this, prgmNameList, prgmImages));
		} catch (Exception e) {

		}

		return rootView;
	}

}