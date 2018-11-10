package com.example.dsm2018.cause_android_user.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.example.dsm2018.cause_android_user.R;
import com.example.dsm2018.cause_android_user.model.DonationListModel;
import java.util.ArrayList;

public class DonationListAdapter extends RecyclerView.Adapter<DonationListAdapter.ViewHolder>{

  public DonationListAdapter(
      ArrayList<DonationListModel> dataList, Context context) {
    this.dataList = dataList;
    this.context = context;
  }

  ArrayList<DonationListModel> dataList;
  Context context;

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View view = LayoutInflater.from(context).inflate(R.layout.item_donation, viewGroup, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
    viewHolder.donationTitle.setText(dataList.get(i).title);
    viewHolder.donationDetail.setText(dataList.get(i).detail);
  }

  @Override
  public int getItemCount() {
    return dataList.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    TextView donationTitle;
    TextView donationDetail;
    Button donationButton;
    public ViewHolder(@NonNull View itemView) {
      super(itemView);
      donationTitle = itemView.findViewById(R.id.donationTitle);
      donationDetail = itemView.findViewById(R.id.donationDetail);
      donationButton = itemView.findViewById(R.id.donationBtn);
    }
  }
}
