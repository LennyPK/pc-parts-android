package com.example.project_2;

import androidx.appcompat.app.AppCompatDelegate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.example.project_2.adapter.CategoryList;
import com.example.project_2.model.DataProvider;

public class MainActivity extends ListActivity{

    class ViewHolder {
        Activity context;

        ListView category_listview;
        CategoryList category_list;
        SearchView search_view;

        public ViewHolder(Activity context) {
            this.context=context;
            initializeItems();
            setListeners();

            category_list = new CategoryList(context);
            category_listview.setAdapter(category_list);
            setListViewHeightBasedOnChildren(category_listview);
        }

        public void initializeItems(){
            category_listview = findViewById(R.id.category_list_view);
            search_view = findViewById(R.id.main_search_view);
        }

        public void setListeners(){
            search_view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    search_view.setIconified(false);
                }
            });
            category_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent listActivity = new Intent(getBaseContext(), ListActivity.class);
                    listActivity.putExtra("CATEGORY", Integer.toString(position));
                    startActivity(listActivity);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
            });
            search_view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    Intent listActivity = new Intent(getBaseContext(), ListActivity.class);
                    listActivity.putExtra("SEARCH_TERM", query);
                    startActivity(listActivity);
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {

                    return false;
                }
            });
        }
    }

    ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        DataProvider.initializeItems();


        vh = new ViewHolder(this);
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