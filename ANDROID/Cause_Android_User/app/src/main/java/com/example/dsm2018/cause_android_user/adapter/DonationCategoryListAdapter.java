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
import com.example.dsm2018.cause_android_user.model.DonationCategoryListModel;
import java.util.ArrayList;

public class DonationCategoryListAdapter extends RecyclerView.Adapter<DonationCategoryListAdapter.ViewHodler>{

  public DonationCategoryListAdapter(
      ArrayList<DonationCategoryListModel> dataList, Context context) {
    this.dataList = dataList;
    this.context = context;
  }

  ArrayList<DonationCategoryListModel> dataList;
  Context context;

  @NonNull
  @Override
  public ViewHodler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View view = LayoutInflater.from(context).inflate(R.layout.item_donation_category, viewGroup, false);
    return new ViewHodler(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHodler viewHodler, int i) {
    viewHodler.category.setText(dataList.get(i).category);
    viewHodler.imageView.setImageResource(dataList.get(i).image);
    viewHodler.total.setText(dataList.get(i).total);
  }

  @Override
  public int getItemCount() {
    return dataList.size();
  }

  public static class ViewHodler extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView category;
    TextView total;
    public ViewHodler(@NonNull View itemView) {
      super(itemView);
      imageView = itemView.findViewById(R.id.imageView);
      category = itemView.findViewById(R.id.catetoroy);
      total = itemView.findViewById(R.id.total);
    }
  }
}
