package com.mobilepractice.silicus.vsacdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SplashActivity extends Activity {

  private Button buttonCrashMe;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);

    setListener();
  }

  /**
   * Crash Application onClick
   */
  private void setListener() {

    buttonCrashMe.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Log.d("####", "Crash Me ");
      }
    });
  }
}
