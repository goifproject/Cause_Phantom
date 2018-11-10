package com.example.dsm2018.cause_android_user.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.example.dsm2018.cause_android_user.R;
import com.example.dsm2018.cause_android_user.activity.ContactUsActivity;
import com.example.dsm2018.cause_android_user.activity.DonationListActivity;
import com.example.dsm2018.cause_android_user.activity.FundingListActivity;
import com.example.dsm2018.cause_android_user.activity.MyInfoActivity;
import com.example.dsm2018.cause_android_user.activity.PointListActivity;
import com.example.dsm2018.cause_android_user.activity.PointShopActivity;

public class SettingFragment extends Fragment {

  LinearLayout myInfoButton, pointShopBtn, pointListBtn, fundListBtn, donationListBtn, contactBtn;

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_setting, container, false);

    myInfoButton = rootView.findViewById(R.id.myInfoButton);
    pointShopBtn = rootView.findViewById(R.id.pointShopBtn);
    pointListBtn = rootView.findViewById(R.id.pointListBtn);
    fundListBtn = rootView.findViewById(R.id.fundListBtn);
    donationListBtn = rootView.findViewById(R.id.donationListBtn);
    contactBtn = rootView.findViewById(R.id.contactBtn);

    myInfoButton.setOnClickListener(v-> startActivity(new Intent(getActivity(), MyInfoActivity.class)));

    pointShopBtn.setOnClickListener(v-> startActivity(new Intent(getActivity(), PointShopActivity.class)));

    pointListBtn.setOnClickListener(v-> startActivity(new Intent(getActivity(), PointListActivity.class)));

    fundListBtn.setOnClickListener(v-> startActivity(new Intent(getActivity(), FundingListActivity.class)));

    donationListBtn.setOnClickListener(v-> startActivity(new Intent(getActivity(),
        DonationListActivity.class)));

    contactBtn.setOnClickListener(v-> startActivity(new Intent(getActivity(), ContactUsActivity.class)));


    return rootView;
  }
}
