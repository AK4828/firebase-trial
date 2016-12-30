package com.posquity.firebase_research;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessaging;

/**
 * Created by akm on 11/16/16.
 */

public class FirebaseInstanceIdServices extends FirebaseInstanceIdService {
    private static final String TAG = "MyFirebaseIIDService";
    private static final String FIREBASE_ENGAGE_TOPIC = "firebase_engage";

    @Override
    public void onTokenRefresh() {
        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "FCM Token: " + token);

        // Once a token is generated, we subscribe to topic.
        FirebaseMessaging.getInstance()
                .subscribeToTopic(FIREBASE_ENGAGE_TOPIC);
    }

    private void sendRegistrationToServer(String token) {

    }
}
