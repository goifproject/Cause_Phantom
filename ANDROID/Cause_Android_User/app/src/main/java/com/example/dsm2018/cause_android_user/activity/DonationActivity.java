package com.example.dsm2018.cause_android_user.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.dsm2018.cause_android_user.R;

public class DonationActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_donation);

    findViewById(R.id.backButton).setOnClickListener(v-> finish());
  }
}
