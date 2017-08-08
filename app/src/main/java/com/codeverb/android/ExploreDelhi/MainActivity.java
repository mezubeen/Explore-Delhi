/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codeverb.android.ExploreDelhi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);



        //Find the view by id
        TextView numbers = (TextView) findViewById(R.id.events);
        //set on click listener on the above View
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();

                Intent numbersIntent = new Intent(MainActivity.this, EventActivity.class);

                //start the activity
                startActivity(numbersIntent);
            }
        });



        //Find the view by id
        TextView foods = (TextView) findViewById(R.id.foods);
        //set on click listener on the above View
        foods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();

                Intent foodsIntent = new Intent(MainActivity.this, FoodActivity.class);

                //start the activity
                startActivity(foodsIntent);
            }
        });




        //Find the view by id
        TextView place = (TextView) findViewById(R.id.places);
        //set on click listener on the above View
        place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();

                Intent PlaceIntent = new Intent(MainActivity.this, PlaceActivity.class);

                //start the activity
                startActivity(PlaceIntent);
            }
        });
    }
}
