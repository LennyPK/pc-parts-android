package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    String[] titles = {
            "ASUS TUF Gaming X570-PLUS (WI-FI) ATX", "asdsdfgds", "asdsfgsd cd", "ABCFG GGHFD", "SDF POOP"
    };

    double[] prices = {
            99, 100, 0.5, 50.99, 999.99
    };

    int[] imageIDs = {
            R.drawable.motherboard, R.drawable.ram, R.drawable.gpu, R.drawable.ram, R.drawable.motherboard
    };

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

        vh = new ViewHolder();

        vh.item_list = new ItemList(this,titles,prices,imageIDs);
        vh.item_listview.setAdapter(vh.item_list);
        setListViewHeightBasedOnChildren(vh.item_listview);

        vh.item_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent ListActivity = new Intent(getBaseContext(), ViewItemActivity.class);
                startActivity(ListActivity);
            }
        });
    }

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