package com.popkova.russianlanguageapp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by User on 23.05.2017.
 */

public class LessonsAdapter extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    public LessonsAdapter(Activity context,
                      String[] web, Integer[] imageId) {
        super(context, R.layout.lessons_list, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.lessons_list, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(web[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}
