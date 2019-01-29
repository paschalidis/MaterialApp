package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;

public class TwoThreeImageView extends android.support.v7.widget.AppCompatImageView {
    public TwoThreeImageView(Context context) {
        super(context);
    }

    public TwoThreeImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TwoThreeImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int threeTwoHeight = MeasureSpec.getSize(widthMeasureSpec) * 3 / 2;
        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, threeTwoHeightSpec);
    }
}
