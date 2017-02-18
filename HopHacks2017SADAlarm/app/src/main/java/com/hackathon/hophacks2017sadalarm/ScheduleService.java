package com.hackathon.hophacks2017sadalarm;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;

/**
 * Created by achee on 2/18/2017.
 */

public class ScheduleService extends IntentService
{

    //Create alarm scheduling service

    //Constructor
    public ScheduleService()
    {
        super("ScheduleService");
    }

    @Override
    public void onHandleIntent(Intent intent)
    {

        MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.foghorn);
        mp.start();
        AlarmReceiver.completeWakefulIntent(intent);

    }




}
