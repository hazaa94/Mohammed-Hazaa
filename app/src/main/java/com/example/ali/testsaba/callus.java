package com.example.ali.testsaba;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class callus extends AppCompatActivity {
    EditText rad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_callus);
        Button button=(Button)findViewById(R.id.button14);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","hazaa94@yahoo.com",null));
                i.putExtra(Intent.EXTRA_SUBJECT,"supject");
                i.putExtra(Intent.EXTRA_TEXT,rad.getText());
                startActivity(Intent.createChooser(i,"send email to "));
            }
        });
        rad=(EditText)findViewById(R.id.editText);
        RadioGroup radiooo=(RadioGroup)findViewById(R.id.radioo);
        RadioButton sug=(RadioButton)findViewById(R.id.radioButton3);
        RadioButton qui=(RadioButton)findViewById(R.id.radioButton);
        RadioButton req=(RadioButton)findViewById(R.id.radioButton2);
        RadioButton prob=(RadioButton)findViewById(R.id.radioButton4);
        RadioButton anoth=(RadioButton)findViewById(R.id.radioButton5);
        /*if(sug.isChecked())
            rad.setText("");

        else if(qui.isChecked())
            rad.setText(qui.getText());
        else if(req.isChecked())
            rad.setText(""+req.getText());
        else if(prob.isChecked())
            rad.setText(prob.getText());
        else
             rad.setText(anoth.getText());*/
    }
    public void sugges(View view) {
        rad.setText("  اقتراح:");
    }
    public void question(View view) {
        rad.setText("  سؤال:");
    }
    public void request(View view) {
        rad.setText("  طلب:");
    }
    public void problem(View view) {
        rad.setText("   مشكلة:");
    }
    public void another(View view) {
        rad.setText("  اخرى:");
    }
}
