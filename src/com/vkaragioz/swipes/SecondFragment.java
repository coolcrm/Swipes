package com.vkaragioz.swipes;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
 
public class  SecondFragment extends Fragment {
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_second, container, false);
        this.setRetainInstance(true);
        //Получаем ссылку на то, что внутри
        TextView tvo;
        try {
        	tvo = (TextView ) getView().findViewById(R.id.trainersView1);
        	//tvo = (TrainerViewObject) getChildAt(0);
        }
        catch (Exception e){
        	
        }
        return rootView;
    }
    
}