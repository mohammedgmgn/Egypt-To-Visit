package com.example.mahmoudshahen.egypttovisit;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mahmoud shahen on 21/04/2017.
 */

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkViewHolder> {

    List<LandmarkData> landmarks;
    Context context;
    public LandmarkAdapter(List<LandmarkData> list, Context con) {
        landmarks = list;
        context = con;
    }
    @Override
    public LandmarkViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.lanmark_item, parent,false);


        return new LandmarkAdapter.LandmarkViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(LandmarkViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return landmarks.size();
    }

    public static class LandmarkViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView imageView;
        public LandmarkViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tv_tile_title);
            imageView = (ImageView)itemView.findViewById(R.id.iv_tile_picture);

        }
    }
}
