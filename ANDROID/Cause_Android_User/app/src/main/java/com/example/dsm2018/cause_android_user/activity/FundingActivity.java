package com.example.dsm2018.cause_android_user.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import com.example.dsm2018.cause_android_user.R;

public class FundingActivity extends AppCompatActivity {

  Button fund;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_funding);

    fund = findViewById(R.id.fund);

    fund.setOnClickListener(v->startActivity(new Intent(getApplicationContext(), FundingSuccess.class)));
  }


}
