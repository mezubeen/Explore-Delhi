package com.codeverb.android.ExploreDelhi;

/**
 * Created by Babar on 8/8/2017.
 */

public class Place {
    private int mImageResourceID;
    private String mTitle;


    public Place(int defaultImageID, String Title) {

        mImageResourceID = defaultImageID;
        mTitle = Title;
    }


    public int getImageResoucrID() {
        return mImageResourceID;
    }

    //Get Default Translation of the word
    public String getTitle() {
        return mTitle;
    }


}
