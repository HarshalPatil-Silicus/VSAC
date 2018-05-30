package com.mobilepractice.silicus.vsacdemo;

import android.app.Application;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

/**
 * Created by Ganesh Tikone on 30/5/18. Company: Silicus Technologies Pvt. Ltd. Email:
 * ganesh.tikone@silicus.com Class:
 */
public class VSACApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    AppCenter.start(this, "1e74a6fd-f435-4fd2-b75a-c11c98c30b74",
        Analytics.class, Crashes.class);
  }
}
