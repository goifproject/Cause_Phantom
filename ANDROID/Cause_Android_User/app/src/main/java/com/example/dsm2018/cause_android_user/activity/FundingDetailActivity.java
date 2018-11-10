package com.example.dsm2018.cause_android_user.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import com.example.dsm2018.cause_android_user.R;
import com.example.dsm2018.cause_android_user.adapter.ContentListAdapter;
import com.example.dsm2018.cause_android_user.model.ContentModel;
import java.util.ArrayList;

public class FundingDetailActivity extends AppCompatActivity {

  RecyclerView contentRecyclerView;
  Button fund;

  ArrayList<ContentModel> dataList;
  LinearLayoutManager layoutManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_funding_detail);

    dataList = new ArrayList<>();
    layoutManager = new LinearLayoutManager(this);

    contentRecyclerView = findViewById(R.id.contentRecyclerView);
    fund = findViewById(R.id.fund);

    fund.setOnClickListener(v-> startActivity(new Intent(getApplicationContext(), FundingActivity.class)));

    dataList.add(new ContentModel("전쟁은 어린이들이 교육받을 기회를 빼앗았습니다.", R.drawable.detail_1, "모든 것이 무너진 시리아. 교육은 유일한 희망입니다. 하지만 학교가 무너져서, \n"
        + "난민이 되어 떠돌아다녀서, 돈을 벌어 가족의 생계를 책임져야 해서. 어린이들은 \n"
        + "교육받지 못하고 있습니다."));

    contentRecyclerView.setLayoutManager(layoutManager);
    contentRecyclerView.setAdapter(new ContentListAdapter(dataList, getApplicationContext()));
  }
}
