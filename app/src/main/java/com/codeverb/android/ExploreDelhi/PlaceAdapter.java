package com.codeverb.android.ExploreDelhi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Babar on 8/8/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {



    public PlaceAdapter(Context context, List<Place> places){
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //find the earthquake at the given position in the list of earthquake
        Place currentItem = getItem(position);

        //Find the textview with view id
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        //display the magnitude of current earthquake in that view
        iconView.setImageResource(currentItem.getImageResoucrID());

        //Find the textview with view id location
        TextView locationView = (TextView) listItemView.findViewById(R.id.title);
        //display the location of current earthquake in that view
        locationView.setText(currentItem.getTitle());




        //returning the list item view to return data
        return listItemView;

    }
}


