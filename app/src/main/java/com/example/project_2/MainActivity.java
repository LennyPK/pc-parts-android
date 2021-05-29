package com.example.project_2;

import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.project_2.model.Category;
import com.example.project_2.model.Item;

public class MainActivity extends ListActivity{

    class ViewHolder {
        ListView category_listview;

        CategoryList category_list;

        public ViewHolder() {
            category_listview = findViewById(R.id.category_list_view);
        }
    }

    ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        //This will be done in the DataLoader code later
        Category.addCategory("Motherboard", R.drawable.motherboard);
        Category.addCategory("RAM", R.drawable.ram);
        Category.addCategory("GPU", R.drawable.gpu);

        //don't know how else to do this, there's probably a better way
        //if this is not run for both MainActivity and ListActivity, errors happen
        Item.INITIALIZE_ITEMS();

        vh = new ViewHolder();

        //This stuff should be inside ViewHolder but it causes problems if it is atm, will fix later
        vh.category_list = new CategoryList(this);
        vh.category_listview.setAdapter(vh.category_list);
        setListViewHeightBasedOnChildren(vh.category_listview);

        vh.category_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent ListActivity = new Intent(getBaseContext(), ListActivity.class);
                startActivity(ListActivity);
            }
        });
    }

    //this function is for resizing the listview so that it doesn't do weird scroll thing
    //taken from: https://stackoverflow.com/a/30497694
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }
}