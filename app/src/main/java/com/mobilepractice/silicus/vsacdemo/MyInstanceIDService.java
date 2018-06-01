package com.mobilepractice.silicus.vsacdemo;

/**
 * Created by SVSonar on 11/21/2017.
 */

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;


public class MyInstanceIDService extends FirebaseInstanceIdService {

  private static final String TAG = "MyInstanceIDService";

  @Override
  public void onTokenRefresh() {

    //For registration of token
    String refreshedToken = FirebaseInstanceId.getInstance().getToken();

    //To displaying token on logcat
    Log.e("TOKEN: ", refreshedToken);

  }
}
