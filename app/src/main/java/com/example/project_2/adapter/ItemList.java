package com.example.project_2.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_2.R;
import com.example.project_2.model.Item;

public class ItemList extends ArrayAdapter {
    private Activity context;
    private int[] IDList;

    //A list of Item IDs is passed in, which allows us to display any subset of items we want
    public ItemList(Activity context, int[] IDList) {
        super(context, R.layout.item_card, Item.getTitlesList(IDList));
        this.context=context;
        this.IDList = IDList;
    }

    //populates each Item Card GUI with data.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item =convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            item = inflater.inflate(R.layout.item_card,null,true);
        TextView itemTitle = (TextView) item.findViewById(R.id.item_title);
        TextView itemPrice = (TextView) item.findViewById(R.id.item_price);
        ImageView imageView = (ImageView) item.findViewById(R.id.item_imageview);

        itemTitle.setText(Item.getItem(IDList[position]).getTitle());
        itemPrice.setText("$" + Double.toString(Item.getItem(IDList[position]).getPrice()));
        imageView.setImageResource(Item.getItem(IDList[position]).getImageIDs().get(0));
        return item;
    }
}
