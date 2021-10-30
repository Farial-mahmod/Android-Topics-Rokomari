package com.khalnayak.leftdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public DrawerLayout drawerLayout;
    public ActionBarDrawerToggle actionBarDrawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // toggle to open/close the drawer
        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        // drawer layout listener
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        // icon stable on the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }


    // opens the nav drawer when clicked
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    // printing Toasts as items are clicked
    public void home(MenuItem item) {

        Toast.makeText(this, "Home clicked.", Toast.LENGTH_SHORT).show();
    }

    public void book(MenuItem item) {
        Toast.makeText(this, "Bookshelf clicked.", Toast.LENGTH_SHORT).show();
    }

    public void fav(MenuItem item) {
        Toast.makeText(this, "Favourites clicked.", Toast.LENGTH_SHORT).show();
    }

    public void auth(MenuItem item) {
        Toast.makeText(this, "Authors clicked.", Toast.LENGTH_SHORT).show();
    }

    public void pub(MenuItem item) {
        Toast.makeText(this, "Publishers clicked.", Toast.LENGTH_SHORT).show();
    }

    public void feed(MenuItem item) {
        Toast.makeText(this, "Feedback clicked.", Toast.LENGTH_SHORT).show();
    }

    public void about(MenuItem item) {
        Toast.makeText(this, "About clicked.", Toast.LENGTH_SHORT).show();
    }
}

