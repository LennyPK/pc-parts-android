package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.project_2.model.Item;

public class ListActivity extends AppCompatActivity {

    //this will eventually go and be replaced by data from the intent.
    int[] itemIDs = {0, 1, 2, 3};

    class ViewHolder {
        ListView item_listview;

        ItemList item_list;

        public ViewHolder() {
            item_listview = findViewById(R.id.item_list_view);
        }
    }

    ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        //don't know how else to do this, there's probably a better way
        //if this is not run for both MainActivity and ListActivity, errors happen
        Item.INITIALIZE_ITEMS();

        vh = new ViewHolder();

        //this should be in ViewHolder but causes issues atm if it is, need to fix
        vh.item_list = new ItemList(this,itemIDs);
        vh.item_listview.setAdapter(vh.item_list);

        //idk if its okay to have this method in MainActivity if it's also called here? Should probably be in a separate class somewhere
        MainActivity.setListViewHeightBasedOnChildren(vh.item_listview);

        vh.item_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent ListActivity = new Intent(getBaseContext(), ViewItemActivity.class);
                startActivity(ListActivity);
            }
        });
    }
}