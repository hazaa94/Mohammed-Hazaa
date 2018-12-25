package com.example.ali.testsaba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class serv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serv);
        Button b1=(Button)findViewById(R.id.buttt11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(serv.this,Serv1.class);
                startActivity(i);
            }
        });


        Button b2=(Button)findViewById(R.id.buttt2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(serv.this,Serv2.class);
                startActivity(i);
            }
        });
    }
}
