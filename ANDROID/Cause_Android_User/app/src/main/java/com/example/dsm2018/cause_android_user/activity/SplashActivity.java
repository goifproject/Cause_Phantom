package com.example.dsm2018.cause_android_user.activity;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.example.dsm2018.cause_android_user.R;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SplashActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);

    getHashKey();

    new Handler().postDelayed(()->{
      startActivity(new Intent(getApplicationContext(), LoginActivity.class));
      finish();
    }, 1000);
  }

  private void getHashKey(){
    PackageInfo packageInfo = null;
    try {
      packageInfo = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
    } catch (PackageManager.NameNotFoundException e) {
      e.printStackTrace();
    }
    if (packageInfo == null)
      Log.e("KeyHash", "KeyHash:null");

    for (Signature signature : packageInfo.signatures) {
      try {
        MessageDigest md = MessageDigest.getInstance("SHA");
        md.update(signature.toByteArray());
        Log.d("KeyHash", Base64.encodeToString(md.digest(), Base64.DEFAULT));
      } catch (NoSuchAlgorithmException e) {
        Log.e("KeyHash", "Unable to get MessageDigest. signature=" + signature, e);
      }
    }
  }
}
