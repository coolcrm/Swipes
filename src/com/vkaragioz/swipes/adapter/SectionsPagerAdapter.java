package com.vkaragioz.swipes.adapter;

import java.util.Locale;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;

import com.vkaragioz.swipes.FourFragment;
import com.vkaragioz.swipes.PlaceholderFragment;
import com.vkaragioz.swipes.SecondFragment;
import com.vkaragioz.swipes.ThirdFragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

	public SectionsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		// getItem is called to instantiate the fragment for the given page.
		// Return a PlaceholderFragment (defined as a static inner class
		// below).
		// return PlaceholderFragment.newInstance(position + 1);
		switch (position) {
		case 0:
			// Top Rated fragment activity
			return new PlaceholderFragment(); // .newInstance(position + 1);;
		case 1:
			// Games fragment activity
			return new SecondFragment();
		case 2:
			// Movies fragment activity
			return new ThirdFragment();

		case 3:
			// Movies fragment activity
			return new FourFragment();
		}
		return null;
	}

	@Override
	public int getCount() {
		// Show 3 total pages.
		return 4;
	}
	/*
	 * @Override public CharSequence getPageTitle(int position) { Locale l =
	 * Locale.getDefault(); switch (position) { case 0: return
	 * getString(R.string.title_section1).toUpperCase(l); case 1: return
	 * getString(R.string.title_section2).toUpperCase(l); case 2: return
	 * getString(R.string.title_section3).toUpperCase(l); } return null; }
	 */
}
