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

public class AlarmReceiver extends WakefulBroadcastReceiver
{

    private AlarmManager manager; //Needed for access to System Alarm Services
    private PendingIntent alarmIntent; //Triggered when alarm fires

    //Begin the alarm service when called
    @Override
    public void onReceive(Context context, Intent intent)
    {

        //Intent to hold data to be delivered to the service
        Intent service = new Intent(context, ScheduleService.class);

        //Begin the service
        startWakefulService(context, service);

    }

    //Sets and saves the alarm
    public void setAlarm(Context context)
    {
        //Create services necessary to create the alarm
        manager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, AlarmReceiver.class);
        alarmIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
        Calendar calendar = Calendar.getInstance();
        /*
        Convert data here from input using analog clock in UI
        to calendar inputtable data, then use these calendar functions
        to set a permanent alarm

        ex.

        calendar.set(Calendar.HOUR_OF_DAY, 8);
        calendar.set(Calendar.MINUTE, 30);

        Sets alarm for 8:30 am
         */
        calendar.set(Calendar.HOUR_OF_DAY, MainActivity.hour);
        calendar.set(Calendar.MINUTE, MainActivity.minute);

        //Set alarm to repeat at the same time everyday
        manager.setInexactRepeating(
                AlarmManager.RTC_WAKEUP,
                calendar.getTimeInMillis(),
                AlarmManager.INTERVAL_DAY,
                alarmIntent
        );

        //Enable receiver to automatically restart the alarm whenever the
        //phone reboots
        /*
        ComponentName receiver = new ComponentName(context, BootReceiver.class);
        PackageManager pm = context.getPackageManager();

        pm.setComponentEnabledSetting(
                receiver,
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                PackageManager.DONT_KILL_APP
        );
        */
    }

    //Cancels the alarm
    public void cancelAlarm(Context context)
    {

        //If alarm has been set, cancel it
        if (manager != null)
        {
            manager.cancel(alarmIntent);
        }

        //Disable boot receiver so it doesn't automatically reset alarm
        //when phone reboots
        /*
        ComponentName receiver = new ComponentName(context, BootReceiver.class);
        PackageManager pm = context.getPackageManager();

        pm.setComponentEnabledSetting(
                receiver,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP
        );
        */

    }

}
