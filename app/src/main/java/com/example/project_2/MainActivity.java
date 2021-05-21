package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    class ViewHolder {
        EditText nameEditText;

        public ViewHolder() {
            nameEditText = findViewById(R.id.name_edit_text);
        }
    }

    ViewHolder vh;
    List<String> toppingsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vh = new ViewHolder();
        toppingsList = new ArrayList<String>();
    }

    public void toppingsCheckOnclick(View v) {
        CheckBox chk = (CheckBox) v;
        if (chk.isChecked())
            toppingsList.add(chk.getText().toString());
        else
            toppingsList.remove(chk.getText().toString());
    }
}