package com.codeverb.android.ExploreDelhi;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Babar on 8/8/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    /** Context of the app */
    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FoodFragment();
        } else if (position == 1){
            return new EventFragment();
        }  else {
            return new PlacesFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_foods);
        } else if (position == 1) {
            return mContext.getString(R.string.category_events);
        }  else {
            return mContext.getString(R.string.category_places);
        }
    }
}
