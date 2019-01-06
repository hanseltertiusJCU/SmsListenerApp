package com.example.android.smslistenerapp;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;

public class DownloadService extends IntentService {
    public static final String TAG = "DownloadService";
    public DownloadService() {
        super("DownloadService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            Intent notifyFinishIntent = new Intent(MainActivity.ACTION_DOWNLOAD_STATUS);
            sendBroadcast(notifyFinishIntent);
        }
    }

}
