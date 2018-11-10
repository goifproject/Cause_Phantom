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
import com.example.dsm2018.cause_android_user.model.FundListModel;
import java.util.ArrayList;

public class FundingListAdapter extends RecyclerView.Adapter<FundingListAdapter.ViewHolder> {

  public FundingListAdapter(ArrayList<FundListModel> dataList, Context context) {
    this.dataList = dataList;
    this.context = context;
  }

  ArrayList<FundListModel> dataList;
  Context context;

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View view = LayoutInflater.from(context).inflate(R.layout.item_funding, viewGroup, false);

    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
    FundListModel data = dataList.get(i);
    viewHolder.fundImg.setImageResource(R.drawable.bg_picture);
    viewHolder.fundName.setText(data.fund_name);
    viewHolder.fundInfo.setText(data.fund_info);
    viewHolder.fundProgress.setText(data.fund_progress + "%");
    viewHolder.fundReturn.setText(data.fund_return + "%");
    viewHolder.fundSup.setText(data.fund_sup + "명");
    viewHolder.fundDl.setText(data.fund_dl + "일");
  }

  @Override
  public int getItemCount() {
    return dataList.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    ImageView fundImg;
    TextView fundName;
    TextView fundInfo;
    TextView fundProgress;
    TextView fundReturn;
    TextView fundSup;
    TextView fundDl;
    public ViewHolder(@NonNull View itemView) {
      super(itemView);
      fundImg = itemView.findViewById(R.id.fund_img);
      fundName = itemView.findViewById(R.id.fund_name);
      fundInfo = itemView.findViewById(R.id.fund_info);
      fundProgress = itemView.findViewById(R.id.fund_progress);
      fundReturn = itemView.findViewById(R.id.fund_return);
      fundSup = itemView.findViewById(R.id.fund_sup);
      fundDl = itemView.findViewById(R.id.fund_dl);
    }
  }
}
