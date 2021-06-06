package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_2.adapter.ImageAdapter;
import com.example.project_2.model.Category;
import com.example.project_2.model.Item;

public class ViewItemActivity extends AppCompatActivity {

    class ViewHolder {
        TextView title;
        TextView price;
        TextView description;
        TextView category_description;
        ImageButton home_button;
        String item_ID;

        ImageButton left_nav;
        ImageButton right_nav;

        ViewPager viewPager;
        ImageAdapter imageAdapter;

        public ViewHolder() {
            price = findViewById(R.id.view_item_price);
            description = findViewById(R.id.view_item_description);
            category_description = findViewById(R.id.view_item_category_description);
            title = findViewById(R.id.view_item_title);
            home_button = findViewById(R.id.view_home_button);

            left_nav = findViewById(R.id.viewpager_left_nav);
            right_nav = findViewById(R.id.viewpager_right_nav);

            left_nav.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewPager.arrowScroll(View.FOCUS_LEFT);
                }
            });

            right_nav.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewPager.arrowScroll(View.FOCUS_RIGHT);
                }
            });

            viewPager = findViewById(R.id.view_item_viewpager);

            item_ID = getIntent().getStringExtra("ITEM_ID");
            if(item_ID != null){
                Item.getItem(Integer.parseInt(item_ID)).incPopularity();
                title.setText(Item.getItem(Integer.parseInt(item_ID)).getTitle());
                price.setText("$" + Item.getItem(Integer.parseInt(item_ID)).getPrice());
                description.setText(Item.getItem(Integer.parseInt(item_ID)).getDescription());
                category_description.setText(Item.getItem(Integer.parseInt(item_ID)).getCategory().getDescription());
            }

            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {

                }

                @Override
                public void onPageScrollStateChanged(int state) {

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
        setContentView(R.layout.activity_view_item);

        vh = new ViewHolder();

        vh.home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainActivity = new Intent(getBaseContext(), MainActivity.class);
                startActivity(mainActivity);
            }
        });
        if(vh.item_ID != null){
            System.out.println("HELLO!!!!");
            System.out.println(Item.getItem(Integer.parseInt(vh.item_ID)).getImageIDs());
            vh.imageAdapter = new ImageAdapter(this, Item.getItem(Integer.parseInt(vh.item_ID)).getImageIDs());
            vh.viewPager.setAdapter(vh.imageAdapter);
            vh.viewPager.setClipToPadding(false);
            vh.viewPager.setPageMargin(40);
            vh.viewPager.setPadding(16,0,16,0);
        }

    }
}