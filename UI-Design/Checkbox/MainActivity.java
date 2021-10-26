package com.khalnayak.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox ch, ch1, ch2, ch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ch=(CheckBox)findViewById(R.id.checkBox);
        ch1=(CheckBox)findViewById(R.id.checkBox2);
        ch2=(CheckBox)findViewById(R.id.checkBox3);
        ch3=(CheckBox)findViewById(R.id.checkBox4);
    }



    public void Check(View v)
    {
        String msg="";

        if(ch.isChecked())
            msg = msg + " Liverpool ";
        if(ch1.isChecked())
            msg = msg + " PSG ";
        if(ch2.isChecked())
            msg = msg + " Man City ";
        if(ch3.isChecked())
            msg = msg + " Tottenham ";

        Toast.makeText(this, msg + "are your favourite.",
                Toast.LENGTH_LONG).show();
    }
}
