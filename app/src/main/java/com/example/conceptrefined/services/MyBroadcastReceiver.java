package com.example.ProtoDeliveryApp.services;

import android.content.Context;
import android.content.Intent;

public class MyBroadcastReceiver extends android.content.BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){
            Intent serviceIntent = new Intent(context, TrackerService.class);
            context.startForegroundService(serviceIntent);
        }
    }
}