package com.example.dsm2018.cause_android_user.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import com.example.dsm2018.cause_android_user.R;

public class FundingSuccess extends AppCompatActivity {

  Button select;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_funding_success);

    select = findViewById(R.id.select);

    select.setOnClickListener(v-> startActivity(new Intent(getApplicationContext(), MainActivity.class)));
  }
}
