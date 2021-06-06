package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Slide;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project_2.adapter.ItemList;
import com.example.project_2.model.Category;
import com.example.project_2.model.DataProvider;

public class ListActivity extends AppCompatActivity {

    //this will eventually go and be replaced by data from the intent.
    int[] itemIDs;

    class ViewHolder {
        ListView item_listview;
        ItemList item_list;
        TextView title_text;
        SearchView search_view;
        CardView home_button;
        String category_position;
        String search_term;

        Fade fade;

        public ViewHolder() {
            item_listview = findViewById(R.id.item_list_view);
            title_text = findViewById(R.id.list_title_text);
            search_view = findViewById(R.id.list_search_view);
            home_button = findViewById(R.id.list_home_button);
            category_position = getIntent().getStringExtra("CATEGORY");
            search_term = getIntent().getStringExtra("SEARCH_TERM");

            fade = new Fade(Fade.IN);

            String title = "There are no results";

            if(search_term != null){
                if(category_position != null){
                    itemIDs = DataProvider.searchResults(search_term, Category.categories.get(Integer.parseInt(category_position)));
                    title = "Showing " + Category.categories.get(Integer.parseInt(category_position)).getName() + " results for '" + search_term + "':";
                } else {
                    itemIDs = DataProvider.searchResults(search_term, null);
                    title = "Showing all results for '" + search_term + "':";
                }
            } else {
                if(category_position != null){
                    itemIDs = DataProvider.getCategory(Integer.parseInt(category_position));
                    title = "Showing " + Category.categories.get(Integer.parseInt(category_position)).getName() + " results:";
                }
            }
            if(itemIDs != null && itemIDs.length==0){
                Toast toast = Toast.makeText(getApplicationContext(),
                        "There are no results",
                        Toast.LENGTH_SHORT);
                toast.show();
            }
            title_text.setText(title);
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
        if(itemIDs!=null){
            vh.item_list = new ItemList(this,itemIDs);
            vh.item_listview.setAdapter(vh.item_list);
        }


        //idk if its okay to have this method in MainActivity if it's also called here? Should probably be in a separate class somewhere
        MainActivity.setListViewHeightBasedOnChildren(vh.item_listview);

        vh.item_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent ViewActivity = new Intent(getBaseContext(), ViewItemActivity.class);
                ViewActivity.putExtra("ITEM_ID", Integer.toString(itemIDs[position]));
                startActivity(ViewActivity);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        vh.search_view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Intent listActivity = new Intent(getBaseContext(), ListActivity.class);
                listActivity.putExtra("SEARCH_TERM", query);
                listActivity.putExtra("CATEGORY", vh.category_position);
                startActivity(listActivity);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });

        vh.home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(getBaseContext(), MainActivity.class);
                startActivity(mainActivity);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
}