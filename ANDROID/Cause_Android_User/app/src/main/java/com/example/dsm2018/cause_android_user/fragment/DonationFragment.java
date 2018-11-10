package com.example.dsm2018.cause_android_user.fragment;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.dsm2018.cause_android_user.R;
import com.example.dsm2018.cause_android_user.RecyclerItemClickListener;
import com.example.dsm2018.cause_android_user.RecyclerItemClickListener.OnItemClickListener;
import com.example.dsm2018.cause_android_user.activity.DonationDetailActivity;
import com.example.dsm2018.cause_android_user.activity.FundingDetailActivity;
import com.example.dsm2018.cause_android_user.adapter.DonationCategoryListAdapter;
import com.example.dsm2018.cause_android_user.adapter.DonationListAdapter;
import com.example.dsm2018.cause_android_user.model.DonationCategoryListModel;
import com.example.dsm2018.cause_android_user.model.DonationListModel;
import java.util.ArrayList;

public class DonationFragment extends Fragment {

  RecyclerView donationRecyclerView;
  LinearLayoutManager layoutManager;

  ArrayList<DonationListModel> dataList;
  ArrayList<DonationCategoryListModel> categoryList;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_donation, container, false);

    layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
    dataList = new ArrayList<>();
    categoryList = new ArrayList<>();

    donationRecyclerView = rootView.findViewById(R.id.donationList);

    dataList.add(new DonationListModel("시리아 어린이들의 잃어버린 6년", "여섯 살 무하마드에게 전쟁은 항상 일상입니다.\n"
        + "6년간 이어진 전쟁, 지금까지 아이가 본 건 폐허가 된\n"
        + "거리에서 울부짖는 울부짖는 사람들 뿐입니다."));
    dataList.add(new DonationListModel("시리아 어린이들의 잃어버린 6년", "여섯 살 무하마드에게 전쟁은 항상 일상입니다.\n"
        + "6년간 이어진 전쟁, 지금까지 아이가 본 건 폐허가 된\n"
        + "거리에서 울부짖는 울부짖는 사람들 뿐입니다."));
    dataList.add(new DonationListModel("시리아 어린이들의 잃어버린 6년", "여섯 살 무하마드에게 전쟁은 항상 일상입니다.\n"
        + "6년간 이어진 전쟁, 지금까지 아이가 본 건 폐허가 된\n"
        + "거리에서 울부짖는 울부짖는 사람들 뿐입니다."));
    dataList.add(new DonationListModel("시리아 어린이들의 잃어버린 6년", "여섯 살 무하마드에게 전쟁은 항상 일상입니다.\n"
        + "6년간 이어진 전쟁, 지금까지 아이가 본 건 폐허가 된\n"
        + "거리에서 울부짖는 울부짖는 사람들 뿐입니다."));

    donationRecyclerView.setLayoutManager(layoutManager);
    donationRecyclerView.setAdapter(new DonationListAdapter(dataList, getActivity()));

    donationRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(),
        donationRecyclerView, new OnItemClickListener() {
      @Override
      public void onItemClick(View view, int position) {
        startActivity(new Intent(getActivity(), DonationDetailActivity.class));
      }

      @Override
      public void onLongItemClick(View view, int position) {

      }
    }));



    return rootView;
  }
}
