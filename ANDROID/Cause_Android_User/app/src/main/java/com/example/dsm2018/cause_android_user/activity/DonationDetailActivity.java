package com.example.dsm2018.cause_android_user.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.dsm2018.cause_android_user.R;
import com.example.dsm2018.cause_android_user.adapter.ContentListAdapter;
import com.example.dsm2018.cause_android_user.model.ContentModel;
import java.util.ArrayList;

public class DonationDetailActivity extends AppCompatActivity {

  RecyclerView contentRecyclerView;

  ArrayList<ContentModel> dataList;
  LinearLayoutManager layoutManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_donation_detail);

    dataList = new ArrayList<>();
    layoutManager = new LinearLayoutManager(this);

    contentRecyclerView = findViewById(R.id.contentRecyclerView);

    dataList.add(new ContentModel("시리아 어린이들이 잃어버린 6년", R.drawable.bg_picture, "여섯 살 무하마드에게 전쟁은 일상입니다. 6년간 이어진 전쟁, 태어나서\n"
        + "지금까지 아이가 본 건 폐허가 된 거리에서 울부짖는 사람뿐입니다.\n"
        + "\n"
        + "매 순간 어린이들의 목숨을 위협하는 폭격, 시리아 어린이들의 시간은 두려움과\n"
        + "공포만이 가득합니다."));



    contentRecyclerView.setLayoutManager(layoutManager);
    contentRecyclerView.setAdapter(new ContentListAdapter(dataList, getApplicationContext()));
  }
}
