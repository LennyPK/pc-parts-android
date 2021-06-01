package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_2.model.Category;
import com.example.project_2.model.Item;

public class ViewItemActivity extends AppCompatActivity {

    class ViewHolder {
        TextView title;
        TextView price;
        TextView description;
        ImageView imageView;
        String item_ID;


        public ViewHolder() {
            price = findViewById(R.id.view_item_price);
            description = findViewById(R.id.view_item_description);
            title = findViewById(R.id.view_item_title);
            imageView = findViewById(R.id.view_item_imageview);

            item_ID = getIntent().getStringExtra("ITEM_ID");
            if(item_ID != null){
                title.setText(Item.getItem(Integer.parseInt(item_ID)).getTitle());
                price.setText("$" + Item.getItem(Integer.parseInt(item_ID)).getPrice());
                description.setText(Item.getItem(Integer.parseInt(item_ID)).getDescription());
                imageView.setImageResource(Item.getItem(Integer.parseInt(item_ID)).getMainImageID());
            }
        }

    }

    ViewHolder vh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_item);

        vh = new ViewHolder();
    }
}