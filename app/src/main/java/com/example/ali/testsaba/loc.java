package com.example.ali.testsaba;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class loc extends Fragment implements View.OnClickListener {
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.loc,container,false);
        ImageButton button=(ImageButton)view.findViewById(R.id.imageButton);
        button.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
       /* Uri g=Uri.parse("google.streetview:cb11=15.343750, 44.168535");
        Intent i = new Intent(Intent.ACTION_VIEW,g);
        i.setPackage("com.google.android.apps.maps");
        startActivity(i);*/
Intent intent=new Intent(loc.this.getActivity(),Maps.class);
        startActivity(intent);


    }
}
