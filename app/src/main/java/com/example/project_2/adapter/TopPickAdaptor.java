package com.example.project_2.adapter;

import android.content.Context;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project_2.R;
import com.example.project_2.model.Item;

import androidx.recyclerview.widget.RecyclerView;

import com.example.project_2.R;
import com.example.project_2.model.Item;

import java.util.List;

public class TopPickAdaptor extends RecyclerView.Adapter<TopPickAdaptor.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView itemTitle;
        public TextView itemPrice;
        public ImageView imageView;

        public ViewHolder(View item) {
            super(item);

            itemTitle = (TextView) item.findViewById(R.id.item_title);
            itemPrice = (TextView) item.findViewById(R.id.item_price);
            imageView = (ImageView) item.findViewById(R.id.item_imageview);
        }
    }

    private List<Item> mItems;
    private Context mContext;

    public TopPickAdaptor(List<Item> topPicks) {
        mItems = topPicks;
    }

    @Override
    public TopPickAdaptor.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(mContext);

        // Inflate the custom layout
        View itemView = inflater.inflate(R.layout.item_card, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(TopPickAdaptor.ViewHolder holder, int position) {
        // Get the data model based on position
        Item item = mItems.get(position);

        // Set item views based on your views and data model
        TextView itemTitle = holder.itemTitle;
        itemTitle.setText(item.getTitle());
        TextView itemPrice = holder.itemPrice;
        itemPrice.setText("$" + Double.toString(item.getPrice()));
        ImageView imageView = holder.imageView;
        imageView.setImageResource(item.getImageIDs().get(0));

    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mItems.size();
    }

}
