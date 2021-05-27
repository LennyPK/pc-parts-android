package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    class ViewHolder {
        CardView motherboard_card;
        public ViewHolder() {
            motherboard_card = (CardView) findViewById(R.id.motherboard);
            motherboard_card.setOnClickListener(MotherboardHandler);
        }
    }

    View.OnClickListener MotherboardHandler = new View.OnClickListener() {
        public void onClick(View view) {
            Intent ListActivity = new Intent(getBaseContext(), ListActivity.class);
            startActivity(ListActivity);
        }
    };

    ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        vh = new ViewHolder();
    }
}