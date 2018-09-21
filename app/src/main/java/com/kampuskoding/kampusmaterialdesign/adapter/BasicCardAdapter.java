package com.kampuskoding.kampusmaterialdesign.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.kampuskoding.kampusmaterialdesign.R;
import com.kampuskoding.kampusmaterialdesign.model.carditem.BasicItem;

import java.util.List;

public class BasicCardAdapter extends RecyclerView.Adapter<BasicCardAdapter.MyViewHolder> {

    private Context mContext;
    private List<BasicItem> itemList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle, txtSubTitle;
        public ImageView imgCover;

        public MyViewHolder(View view) {
            super(view);
            txtTitle = view.findViewById(R.id.txt_title);
            txtSubTitle = view.findViewById(R.id.txt_sub_title);
            imgCover = view.findViewById(R.id.img_cover);
        }
    }


    public BasicCardAdapter(Context mContext, List<BasicItem> albumList) {
        this.mContext = mContext;
        this.itemList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_card_basic, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        BasicItem item = itemList.get(position);
        holder.txtTitle.setText(item.getTitle());
        holder.txtSubTitle.setText(item.getSubTitle());
        // loading album cover using Glide library
        Glide.with(mContext).load(item.getImageCover()).into(holder.imgCover);

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
