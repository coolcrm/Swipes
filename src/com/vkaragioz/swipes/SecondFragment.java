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
	public static int[] prgmImages = { R.drawable.images, R.drawable.images1,
			R.drawable.images2, R.drawable.images3, R.drawable.images4,
			R.drawable.images5, R.drawable.images6, R.drawable.images7,
			R.drawable.images8 };
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