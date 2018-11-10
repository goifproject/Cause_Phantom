package com.example.dsm2018.cause_android_user.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import com.example.dsm2018.cause_android_user.R;
import com.example.dsm2018.cause_android_user.adapter.FundingCategoryAdapter;
import com.example.dsm2018.cause_android_user.fragment.DonationFragment;
import com.example.dsm2018.cause_android_user.fragment.FundingFragment;
import com.example.dsm2018.cause_android_user.fragment.SettingFragment;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  BottomNavigationView bottomNavigationView;

  FragmentTransaction fragmentTransaction;

  ImageView search;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    fragmentTransaction = getSupportFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.navigation_container, new FundingFragment()).commit();

    bottomNavigationView = findViewById(R.id.bottomNavigationView);
    search = findViewById(R.id.search);

    bottomNavigationView.setOnNavigationItemSelectedListener(
        menuItem -> {
          switch (menuItem.getItemId()) {
            case R.id.funding:
              fragmentTransaction = getSupportFragmentManager().beginTransaction();
              fragmentTransaction.replace(R.id.navigation_container, new FundingFragment())
                  .commit();
              return true;
            case R.id.donation:
              fragmentTransaction = getSupportFragmentManager().beginTransaction();
              fragmentTransaction.replace(R.id.navigation_container, new DonationFragment())
                  .commit();
              return true;
            case R.id.setting:
              fragmentTransaction = getSupportFragmentManager().beginTransaction();
              fragmentTransaction.replace(R.id.navigation_container, new SettingFragment())
                  .commit();
              return true;
          }
          return false;
        });

    search.setOnClickListener(v-> startActivity(new Intent(getApplicationContext(), SearchActivity.class)));

  }
}
