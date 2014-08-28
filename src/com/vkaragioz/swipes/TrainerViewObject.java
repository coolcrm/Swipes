package com.vkaragioz.swipes;

import android.content.Context;

import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

public class TrainerViewObject extends LinearLayout {

	private View mValue;
	private ImageView mImage;

	public TrainerViewObject(Context context, AttributeSet attrs) {
		super(context, attrs);
		// Воспользуемся этим конструктором
		// TypedArray a = context.obtainStyledAttributes(attrs,
		// R.styleable.ColorOptionsView, 0, 0);
		// String titleText =
		// a.getString(R.styleable.ColorOptionsView_titleText);

		int valueColor = android.R.color.holo_red_dark;
		// a.recycle();

		setOrientation(LinearLayout.HORIZONTAL);
		setGravity(Gravity.CENTER_VERTICAL);

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.trainer_view_object, this, true);

		//TextView title = (TextView) getChildAt(1);
		//title.setText("Валерий Горбунов, КМС");

		//mImage = (ImageView) getChildAt(0);
		//mImage.setImageResource(R.drawable.ic_launcher);
		
		//RatingBar ratingBar = (RatingBar) getChildAt(2);
		//ratingBar.setRating(4.0f); 

		// mValue = getChildAt(3);
		// mValue.setBackgroundColor(valueColor);

	}
	
	public void stubSetTrainerName (String name){
		TextView title = (TextView) getChildAt(1);
		title.setText(name);
	}

	public TrainerViewObject(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

}
