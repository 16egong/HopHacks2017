package com.hackathon.hophacks2017sadalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.content.WakefulBroadcastReceiver;

import java.util.Calendar;

/**
 * Created by achee on 2/17/2017.
 */

public class AlarmReceiver extends WakefulBroadcastReceiver {

    private AlarmManager manager; //Needed for access to System Alarm Services
    private PendingIntent alarmIntent; //Triggered when alarm fires

    //Begin the alarm service when called
    @Override
    public void onReceive(Context context, Intent intent)
    {
        
    }

}
