package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.project_2.model.Category;
import com.example.project_2.model.Item;

import org.w3c.dom.Text;

public class ListActivity extends AppCompatActivity {

    //this will eventually go and be replaced by data from the intent.
    int[] itemIDs = {0, 1, 2, 3, 4};

    class ViewHolder {
        ListView item_listview;
        ItemList item_list;
        TextView title_text;
        String category_position;

        public ViewHolder() {
            item_listview = findViewById(R.id.item_list_view);
            title_text = findViewById(R.id.list_title_text);
            category_position = getIntent().getStringExtra("CATEGORY");
            if(category_position != null){
                title_text.setText(Category.categories.get(Integer.parseInt(category_position)).getName());
            }
        }
    }

    ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_list);

        vh = new ViewHolder();

        //this should be in ViewHolder but causes issues atm if it is, need to fix
        vh.item_list = new ItemList(this,itemIDs);
        vh.item_listview.setAdapter(vh.item_list);

        //idk if its okay to have this method in MainActivity if it's also called here? Should probably be in a separate class somewhere
        MainActivity.setListViewHeightBasedOnChildren(vh.item_listview);

        vh.item_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent ViewActivity = new Intent(getBaseContext(), ViewItemActivity.class);
                ViewActivity.putExtra("ITEM_ID", Integer.toString(itemIDs[position]));
                startActivity(ViewActivity);
            }
        });
    }
}