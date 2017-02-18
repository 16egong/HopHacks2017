package com.hackathon.hophacks2017sadalarm;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.Context;

/**
 * Created by achee on 2/18/2017.
 */

public class BootReceiver extends BroadcastReceiver
{

    AlarmReceiver alarm = new AlarmReceiver();

    //Automatically restarts alarm when phone is rebooted
    @Override
    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED"))
        {
            //alarm.setAlarm(context);
        }
    }

}
