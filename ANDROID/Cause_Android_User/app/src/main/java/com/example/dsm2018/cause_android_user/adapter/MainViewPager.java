package com.example.dsm2018.cause_android_user.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.example.dsm2018.cause_android_user.fragment.MainViewPager1;
import com.example.dsm2018.cause_android_user.fragment.MainViewPager2;

public class MainViewPager extends FragmentStatePagerAdapter {

  int tabCount;

  public MainViewPager(FragmentManager fm, int tabCount) {
    super(fm);
    this.tabCount = tabCount;
  }

  @Override
  public Fragment getItem(int i) {
    switch (i) {
      case 0:
        return new MainViewPager1();
      case 1:
        return new MainViewPager2();
    }
    return null;
  }

  @Override
  public int getCount() {
    return tabCount;
  }
}
