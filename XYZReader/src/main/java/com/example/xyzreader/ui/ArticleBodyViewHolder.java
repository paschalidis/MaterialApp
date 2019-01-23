package com.example.xyzreader.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.example.xyzreader.R;

public class ArticleBodyViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextView;


    public ArticleBodyViewHolder(View itemView, Context context) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.article_body);
        mTextView.setTypeface(Typeface.createFromAsset(context.getResources().getAssets(), "Rosario-Regular.ttf"));
    }

    public void bind(String data){
        data = data + "<br />";
        mTextView.setText(Html.fromHtml(data));
    }
}
