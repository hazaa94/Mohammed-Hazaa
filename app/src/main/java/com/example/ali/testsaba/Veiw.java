package com.example.ali.testsaba;

import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Veiw extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.veiw, container, false);
        TextView tv=(TextView)rootView.findViewById(R.id.tvv2);
        Typeface font=Typeface.createFromAsset(getActivity().getAssets(),"fonts/droid.ttf");
        tv.setTypeface(font);

        TextView tv1=(TextView)rootView.findViewById(R.id.tvv1);
        Typeface font1=Typeface.createFromAsset(getActivity().getAssets(),"fonts/ge.OTF");
        tv1.setTypeface(font1);

        TextView tv2=(TextView)rootView.findViewById(R.id.tv1);
        Typeface font2=Typeface.createFromAsset(getActivity().getAssets(),"fonts/ge.OTF");
        tv2.setTypeface(font2);

        TextView tv3=(TextView)rootView.findViewById(R.id.tv2);
        Typeface font3=Typeface.createFromAsset(getActivity().getAssets(),"fonts/droid.ttf");
        tv3.setTypeface(font3);


        return rootView;
    }
}
