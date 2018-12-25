package com.example.ali.testsaba;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Aboutunii extends Fragment  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_aboutunii, container, false);
      //  return rootView;




        TextView tv2=(TextView)rootView.findViewById(R.id.tv1);
        Typeface font2=Typeface.createFromAsset(getActivity().getAssets(),"fonts/ge.OTF");
        tv2.setTypeface(font2);

        TextView tv3=(TextView)rootView.findViewById(R.id.tv2);
        Typeface font3=Typeface.createFromAsset(getActivity().getAssets(),"fonts/droid.ttf");
        tv3.setTypeface(font3);


        return rootView;
    }

}
