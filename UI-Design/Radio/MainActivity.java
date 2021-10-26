package com.khalnayak.radio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void onRadioButtonClicked(View view) {

            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {

                case R.id.order:
                    if (checked)
                        Toast.makeText(this, "Ordered successfully.", Toast.LENGTH_SHORT).show();
                        break;

                case R.id.wish:
                    if (checked)
                        Toast.makeText(this, "Wishlist updated.", Toast.LENGTH_SHORT).show();
                    break;
            }
        }



    }
