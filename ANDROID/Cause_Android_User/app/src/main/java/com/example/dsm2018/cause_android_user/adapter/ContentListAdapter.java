package com.example.dsm2018.cause_android_user.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.dsm2018.cause_android_user.R;
import com.example.dsm2018.cause_android_user.model.ContentModel;
import java.util.ArrayList;

public class ContentListAdapter extends RecyclerView.Adapter<ContentListAdapter.ViewHolder>{

  public ContentListAdapter(
      ArrayList<ContentModel> dataList, Context context) {
    this.dataList = dataList;
    this.context = context;
  }

  ArrayList<ContentModel> dataList;
  Context context;

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View view = LayoutInflater.from(context).inflate(R.layout.item_content, viewGroup, false);

    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
    viewHolder.detail.setText(dataList.get(i).detail);
    viewHolder.title.setText(dataList.get(i).title);
    viewHolder.imageView.setImageResource(dataList.get(i).image);
  }

  @Override
  public int getItemCount() {
    return dataList.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    ImageView imageView;
    TextView detail;
    public ViewHolder(@NonNull View itemView) {
      super(itemView);
      title = itemView.findViewById(R.id.title);
      imageView = itemView.findViewById(R.id.image);
      detail = itemView.findViewById(R.id.detail);
    }
  }
}
