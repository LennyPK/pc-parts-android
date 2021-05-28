package com.example.project_2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CategoryList extends ArrayAdapter{
    private int[] imageIDs;
    private String[] names;
    private Activity context;

    public CategoryList(Activity context, String[] names, int[] imageIDs) {
        super(context, R.layout.category_card, names);
        this.names=names;
        this.imageIDs = imageIDs;
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View category =convertView;
        LayoutInflater inflater = context.getLayoutInflater();
        if(convertView==null)
            category = inflater.inflate(R.layout.category_card,null,true);
        TextView textViewName = (TextView) category.findViewById(R.id.category_textview);
        ImageView imageView = (ImageView) category.findViewById(R.id.category_imageview);

        textViewName.setText(names[position]);
        imageView.setImageResource(imageIDs[position]);
        return category;
    }
}
