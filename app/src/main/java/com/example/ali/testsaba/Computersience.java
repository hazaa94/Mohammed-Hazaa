package com.example.ali.testsaba;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Computersience extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computersience);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView tv=(TextView)findViewById(R.id.tvv2);
        Typeface font=Typeface.createFromAsset(getAssets(),"fonts/droid.ttf");
        tv.setTypeface(font);

        TextView tv1=(TextView)findViewById(R.id.tvv1);
        Typeface font1=Typeface.createFromAsset(getAssets(),"fonts/ge.OTF");
        tv1.setTypeface(font1);

        TextView tv2=(TextView)findViewById(R.id.tv1);
        Typeface font2=Typeface.createFromAsset(getAssets(),"fonts/ge.OTF");
        tv2.setTypeface(font2);

        TextView tv3=(TextView)findViewById(R.id.tv2);
        Typeface font3=Typeface.createFromAsset(getAssets(),"fonts/droid.ttf");
        tv3.setTypeface(font3);

        TextView tv31=(TextView)findViewById(R.id.tvv3);
        tv31.setTypeface(font);
        TextView tv311=(TextView)findViewById(R.id.tvv4);
        tv311.setTypeface(font);


        TextView tv3111=(TextView)findViewById(R.id.tv3);
        tv3111.setTypeface(font1);
        TextView tv3121=(TextView)findViewById(R.id.tv4);
        tv3121.setTypeface(font1);



    }
}
