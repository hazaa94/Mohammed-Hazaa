package com.example.ali.testsaba;

import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Mom extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.mom, container, false);


        TextView tv3=(TextView)rootView.findViewById(R.id.tv2);
        Typeface font3=Typeface.createFromAsset(getActivity().getAssets(),"fonts/droid.ttf");
        tv3.setTypeface(font3);


        return rootView;
    }
}
