package com.example.xyzreader.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.xyzreader.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArticleBodyAdapter extends RecyclerView.Adapter<ArticleBodyViewHolder> {

    private List<String> mArticles;

    public ArticleBodyAdapter(String article){
        mArticles = new ArrayList<>();
        mArticles = Arrays.asList(article.split("<br /><br />", -1));
    }

    @NonNull
    @Override
    public ArticleBodyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        int articleItemTextId = R.layout.article_item_text;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(articleItemTextId, parent, false);
        return new ArticleBodyViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleBodyViewHolder holder, int position) {
        holder.bind(mArticles.get(position));
    }

    @Override
    public int getItemCount() {
        if(mArticles == null){
            return 0;
        }
        return mArticles.size();
    }

}
