package com.codeverb.android.ExploreDelhi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_lists);

        //create an array for words
        ArrayList<Place> place = new ArrayList<Place>();
        place.add(new Place(  R.drawable.world,"red"));
        place.add(new Place( R.drawable.world,"red"));
        place.add(new Place( R.drawable.family_mother,"red"));





        PlaceAdapter Adapter = new PlaceAdapter(this, place);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);
    }
}
