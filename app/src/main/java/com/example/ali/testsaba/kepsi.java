package com.example.ali.testsaba;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class kepsi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kepsi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView tv1=(TextView)findViewById(R.id.tt1);
        Typeface font1=Typeface.createFromAsset(getAssets(),"fonts/ge.OTF");
        Typeface font2=Typeface.createFromAsset(getAssets(),"fonts/droid.ttf");
        tv1.setTypeface(font1);

        TextView tv2=(TextView)findViewById(R.id.tt2);
        tv2.setTypeface(font1);

        TextView tv3=(TextView)findViewById(R.id.tt3);
        tv3.setTypeface(font1);

        TextView tv11=(TextView)findViewById(R.id.t1);
        tv11.setTypeface(font2);

        TextView tv22=(TextView)findViewById(R.id.t2);
        tv22.setTypeface(font2);

        TextView tv33=(TextView)findViewById(R.id.t3);
        tv33.setTypeface(font2);

        ImageButton ha=(ImageButton)findViewById(R.id.Hazaaa);
        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(kepsi.this, " محمد نبيل عبدالحميد هزاع ", Toast.LENGTH_SHORT).show();
                Uri uri =Uri.parse("http://facebook.com/hazaa94");

                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        ImageButton ke=(ImageButton)findViewById(R.id.kebsii);
        ke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(kepsi.this, " محمد عبدالله علي المسيكي ", Toast.LENGTH_SHORT).show();
                Uri uri =Uri.parse("http://facebook.com/mohammed.aljubani");

                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });
        ImageButton mo=(ImageButton)findViewById(R.id.mohamed);
        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(kepsi.this, " محمد يحيى حسين الكبسي", Toast.LENGTH_SHORT).show();
            }

        });
        ImageButton l=(ImageButton)findViewById(R.id.imageButton);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(kepsi.this,callus.class);
                startActivity(i);
            }
        });
        Button f=(Button)findViewById(R.id.button);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(kepsi.this, "الدكتور منير عبدالله المخلافي ", Toast.LENGTH_SHORT).show();
                Uri uri =Uri.parse("http://facebook.com/munir.almekhlafi");

                Intent i=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);

            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
