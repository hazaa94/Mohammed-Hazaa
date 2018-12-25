package com.example.ali.testsaba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Colleges extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colleges);
        Button medical=(Button)findViewById(R.id.button2);

        medical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Colleges.this,Mediecalde.class);
                startActivity(i);
            }
        });
        final Button dantist=(Button)findViewById(R.id.button3);
        dantist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Colleges.this,Dantist.class);
                startActivity(i);
            }
        });
        Button computer=(Button)findViewById(R.id.button9);
        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Colleges.this,Computersience.class);
                startActivity(i);
            }
        });
        Button engineer=(Button)findViewById(R.id.button10);
        engineer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Colleges.this,Engineering.class);
                startActivity(i);
            }
        });
        Button law=(Button)findViewById(R.id.button12);
        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Colleges.this,Laws.class);
                startActivity(i);
            }
        });
        Button art=(Button)findViewById(R.id.button11);
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Colleges.this,Arts.class);
                startActivity(i);
            }
        });
        Button tarbia=(Button)findViewById(R.id.button13);
        tarbia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Colleges.this,Tarbiah.class);
                startActivity(i);
            }
        });



    }
}
