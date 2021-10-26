package com.khalnayak.spinner;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    String[] Rokomari_departments = { "Soft", "Admin", "Hr", "Finance", "Logistics"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Getting the Spinner instance and applying OnItemSelectedListener on it

        Spinner spin = findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);


        // Initializing the ArrayAdapter instance having the dept. list

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Rokomari_departments);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(), Rokomari_departments[position] , Toast.LENGTH_LONG).show();

    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

        // in case nothing gets selected

    }
}
