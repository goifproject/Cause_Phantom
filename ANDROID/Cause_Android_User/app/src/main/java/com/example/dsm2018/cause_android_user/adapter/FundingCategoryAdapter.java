package com.example.dsm2018.cause_android_user.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.example.dsm2018.cause_android_user.R;
import com.example.dsm2018.cause_android_user.fragment.FundingFragment;
import java.util.ArrayList;

public class FundingCategoryAdapter extends RecyclerView.Adapter<FundingCategoryAdapter.ViewHolder>{

  ArrayList<String> dataList;
  Context context;

  public FundingCategoryAdapter(ArrayList<String> dataList, Context context) {
    this.dataList = dataList;
    this.context = context;
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View view = LayoutInflater.from(context).inflate(R.layout.item_funding_category, viewGroup, false);


    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
    Log.d("DEBUGLOG", "onBindViewHolder 호출됨");
    viewHolder.categoryButton.setText(dataList.get(i));
    if(i == 0)
      viewHolder.categoryButton.setBackground(context.getResources().getDrawable(R.drawable.round_primary));
    viewHolder.categoryButton.setOnClickListener(v -> {
      viewHolder.categoryButton.setBackgroundDrawable(context.getResources().getDrawable(R.drawable.round_primary));
    });
  }

  @Override
  public int getItemCount() {
    return dataList.size();
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    TextView categoryButton;
    public ViewHolder(@NonNull View itemView) {
      super(itemView);
      categoryButton = itemView.findViewById(R.id.categoryButton);
    }
  }
}
