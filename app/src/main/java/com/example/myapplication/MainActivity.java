package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        // step 1 : toolbar visible hobe
        setSupportActionBar(toolbar);
        // step 2 : backbutton deya
        if(toolbar!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            // eivabe na dile my title bar asbe naa
            getSupportActionBar().setTitle("My toolbar");
        }
        // step 3 : toolbar title and subtytle

        toolbar.setSubtitle("sub title");
    }
    // step 4 : 3 dot button so, menu bananor por eikhane aste hobe

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    // step 5 : menur option click korle ki hobe

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.option_home)
            Toast.makeText(this, "Home button is clicked", Toast.LENGTH_SHORT).show();
        if(item.getItemId()==R.id.option_new)
            Toast.makeText(this, "New button is clicked", Toast.LENGTH_SHORT).show();
        if(item.getItemId()==R.id.option_open)
            Toast.makeText(this, "Open button is clicked", Toast.LENGTH_SHORT).show();
        if(item.getItemId()==R.id.option_share)
            Toast.makeText(this, "Share button is clicked", Toast.LENGTH_SHORT).show();
        // default back press method
        if(item.getItemId()==android.R.id.home)
        {
            Toast.makeText(this, "Back button is clicked", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}