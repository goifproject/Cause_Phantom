package com.example.dsm2018.cause_android_user.model;

public class FundListModel {
  public String fund_name;
  public String fund_info;
  public String fund_progress;
  public String fund_return;
  public String fund_sup;
  public String fund_dl;

  public FundListModel(String fund_name, String fund_info, String fund_progress,
      String fund_return, String fund_sup, String fund_dl) {
    this.fund_name = fund_name;
    this.fund_info = fund_info;
    this.fund_progress = fund_progress;
    this.fund_return = fund_return;
    this.fund_sup = fund_sup;
    this.fund_dl = fund_dl;
  }
}
