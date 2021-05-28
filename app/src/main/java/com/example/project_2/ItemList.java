package com.example.project_2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemList extends ArrayAdapter {
    private int[] imageIDs;
    private String[] titles;
    private double[] prices;
    private Activity context;

    public ItemList(Activity context, String[] titles, double[] prices, int[] imageIDs) {
        super(context, R.layout.item_card, titles);
        this.titles=titles;
        this.imageIDs = imageIDs;
        this.prices=prices;
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item =convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            item = inflater.inflate(R.layout.item_card,null,true);
        TextView itemTitle = (TextView) item.findViewById(R.id.item_title);
        TextView itemPrice = (TextView) item.findViewById(R.id.item_price);
        ImageView imageView = (ImageView) item.findViewById(R.id.item_imageview);

        itemTitle.setText(titles[position]);
        itemPrice.setText(Double.toString(prices[position]));
        imageView.setImageResource(imageIDs[position]);
        return item;
    }
}
