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
import com.kampuskoding.kampusmaterialdesign.model.carditem.TimelineItem;

import java.util.List;

public class TimelineCardAdapter extends RecyclerView.Adapter<TimelineCardAdapter.MyViewHolder> {

    private Context mContext;
    private List<TimelineItem> itemList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtName, txtDescription,txtDate;
        public ImageView imgCover,imgProfile;

        public MyViewHolder(View view) {
            super(view);
            txtName = view.findViewById(R.id.txt_name);
            txtDate = view.findViewById(R.id.txt_date);
            txtDescription = view.findViewById(R.id.txt_description);
            imgCover = view.findViewById(R.id.img_cover);
            imgProfile = view.findViewById(R.id.img_profile);
        }
    }

    public TimelineCardAdapter(Context mContext, List<TimelineItem> albumList) {
        this.mContext = mContext;
        this.itemList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_card_timeline, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        TimelineItem item = itemList.get(position);
        holder.txtName.setText(item.getName());
        holder.txtDate.setText(item.getDate());
        holder.txtDescription.setText(item.getDescription());
        // loading album cover using Glide library
        Glide.with(mContext).load(item.getImgCover()).into(holder.imgCover);
        Glide.with(mContext).load(item.getImgProfile()).into(holder.imgProfile);

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
