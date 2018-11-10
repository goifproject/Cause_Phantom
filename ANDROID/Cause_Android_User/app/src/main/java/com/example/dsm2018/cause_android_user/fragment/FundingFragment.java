package com.example.dsm2018.cause_android_user.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.OnTabSelectedListener;
import android.support.design.widget.TabLayout.Tab;
import android.support.design.widget.TabLayout.TabLayoutOnPageChangeListener;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.dsm2018.cause_android_user.R;
import com.example.dsm2018.cause_android_user.RecyclerItemClickListener;
import com.example.dsm2018.cause_android_user.RecyclerItemClickListener.OnItemClickListener;
import com.example.dsm2018.cause_android_user.activity.FundingDetailActivity;
import com.example.dsm2018.cause_android_user.adapter.FundingCategoryAdapter;
import com.example.dsm2018.cause_android_user.adapter.FundingListAdapter;
import com.example.dsm2018.cause_android_user.adapter.MainViewPager;
import com.example.dsm2018.cause_android_user.model.FundListModel;
import java.util.ArrayList;

public class FundingFragment extends Fragment {

  RecyclerView categoryRecyclerView;
  RecyclerView fundingRecyclerView;

  ViewPager viewPager;
  TabLayout tabLayout;

  ArrayList<String> categoryList;
  ArrayList<FundListModel> fundListData;
  LinearLayoutManager layoutManager;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_funding, container, false);

    categoryList = new ArrayList<>();
    fundListData = new ArrayList<>();
    layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);

    categoryRecyclerView = rootView.findViewById(R.id.categoryRecyclerView);
    fundingRecyclerView = rootView.findViewById(R.id.fundingRecyclerView);
    viewPager = rootView.findViewById(R.id.viewPager);
    tabLayout = rootView.findViewById(R.id.tabLayout);

    tabLayout.addTab(tabLayout.newTab());
    tabLayout.addTab(tabLayout.newTab());

    MainViewPager mainViewPager = new MainViewPager(getFragmentManager(), tabLayout.getTabCount());
    viewPager.setAdapter(mainViewPager);
    viewPager.addOnPageChangeListener(new TabLayoutOnPageChangeListener(tabLayout));
    tabLayout.addOnTabSelectedListener(new OnTabSelectedListener() {
      @Override
      public void onTabSelected(Tab tab) {
        viewPager.setCurrentItem(tab.getPosition());
      }

      @Override
      public void onTabUnselected(Tab tab) {

      }

      @Override
      public void onTabReselected(Tab tab) {

      }
    });

    categoryList.add("인기 펀딩");
    categoryList.add("급상승 펀딩");
    categoryList.add("어린이");
    categoryList.add("여성");
    categoryList.add("난민");

    categoryRecyclerView.setLayoutManager(layoutManager);
    categoryRecyclerView.setAdapter(new FundingCategoryAdapter(categoryList, getActivity()));

    fundingRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), categoryRecyclerView,
        new OnItemClickListener() {
          @Override
          public void onItemClick(View view, int position) {
            startActivity(new Intent(getActivity(), FundingDetailActivity.class));
          }

          @Override
          public void onLongItemClick(View view, int position) {

          }
        }));

    layoutManager = new LinearLayoutManager(getActivity());
    fundingRecyclerView.setLayoutManager(layoutManager);
    fundListData.add(new FundListModel("시리아 어린이들이 잃어버린 6년", "여섯 살 무하마드에게 전쟁은 일상입니다. 6년간 이어진 전쟁, 태어나서\n"
        + "지금까지 아이가 본 건 폐허가 된 거리에서 울부짖는 사람뿐입니다.\n"
        + "\n"
        + "매 순간 어린이들의 목숨을 위협하는 폭격, 시리아 어린이들의 시간은 두려움과\n"
        + "공포만이 가득합니다.", "67", "75", "44", "85"));
    fundingRecyclerView.setAdapter(new FundingListAdapter(fundListData, getActivity()));
    return rootView;
  }
}
