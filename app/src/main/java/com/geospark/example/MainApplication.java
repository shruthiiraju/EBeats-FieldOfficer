package com.geospark.example;

import android.app.Application;

import com.geospark.lib.GeoSpark;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
        FirebaseInstanceId.getInstance().getToken();
        GeoSpark.initialize(this, "86ec4e69b778b241993c5e387ea54d9ecbc4b3dabff0999c9167c0fc81ea75e7");
    }
}
