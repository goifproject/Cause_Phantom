package com.example.dsm2018.cause_android_user.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window.Callback;
import android.widget.ImageView;
import com.example.dsm2018.cause_android_user.R;
import com.facebook.CallbackManager;
import com.facebook.login.LoginManager;
import java.util.Arrays;

public class LoginActivity extends AppCompatActivity {

  ImageView facebookLoginBtn;
  CallbackManager callbackManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

    callbackManager = CallbackManager.Factory.create();

    facebookLoginBtn = findViewById(R.id.facebookLoginBtn);

    facebookLoginBtn.setOnClickListener(v-> {
//      LoginManager.getInstance().logInWithReadPermissions(LoginActivity.this, Arrays.asList("email"));
      startActivity(new Intent(getApplicationContext(), MainActivity.class));
      finish();
    });
  }
}
