package com.codeverb.android.ExploreDelhi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.place_lists, container, false);


        //create an array for words
        ArrayList<Place> place = new ArrayList<Place>();
        place.add(new Place(  R.drawable.world,"red"));
        place.add(new Place( R.drawable.world,"red"));
        place.add(new Place( R.drawable.family_mother,"red"));





        PlaceAdapter Adapter = new PlaceAdapter(getActivity(), place);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(Adapter);



        return rootView;
    }

}
