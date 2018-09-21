package com.kampuskoding.kampusmaterialdesign.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kampuskoding.kampusmaterialdesign.R;
import com.kampuskoding.kampusmaterialdesign.model.carditem.SimpleItem;

import java.util.List;

public class SimpleCardAdapter extends RecyclerView.Adapter<SimpleCardAdapter.MyViewHolder> {

    private Context mContext;
    private List<SimpleItem> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle;

        public MyViewHolder(View view) {
            super(view);
            txtTitle = (TextView) view.findViewById(R.id.txt_title);
        }
    }


    public SimpleCardAdapter(Context mContext, List<SimpleItem> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_card_simple, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        SimpleItem model = albumList.get(position);
        holder.txtTitle.setText(model.getNama());
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}
