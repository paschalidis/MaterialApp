/**
 * used from: https://gist.github.com/anonymous/d532d41fa01c02a65782
 */
package com.example.xyzreader.ui;


import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.example.xyzreader.R;

public class ParallaxPageTransformer implements ViewPager.PageTransformer {

    public void transformPage(View view, float position) {

        int pageWidth = view.getWidth();
        FloatingActionButton shareButton = view.findViewById(R.id.share_fab);

        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            view.setAlpha(1);

        } else if (position <= 1) { // [-1,1]

            ImageView bookPhoto = view.findViewById(R.id.photo);
            bookPhoto.setTranslationX(-position * (pageWidth / 2)); //Half the normal speed

            shareButton.setRotation(360);

        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            view.setAlpha(1);
        }


    }
}
