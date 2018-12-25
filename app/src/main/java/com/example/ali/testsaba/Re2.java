package com.example.ali.testsaba;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.*;

/**
 * Created by ali on 4/9/17.
 */

public class Re2 extends Fragment implements View.OnClickListener
{
View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.re2,container,false);
        Button button=(Button)view.findViewById(R.id.online);
        button.setOnClickListener(this);
        return view;

    }


    @Override
    public void onClick(View v) {
        Uri uri =Uri.parse("http://oasyemen.net/index.html");

                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }



            }


