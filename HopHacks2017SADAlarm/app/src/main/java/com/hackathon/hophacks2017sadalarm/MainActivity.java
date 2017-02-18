package com.hackathon.hophacks2017sadalarm;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.TextView;
import android.content.Context;
import android.content.Intent;
import android.app.PendingIntent;
import android.app.AlarmManager;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public AlarmReceiver alarm = new AlarmReceiver();
    public static int hour, minute;
    public static int b = 0;
    private static Intent alarmIntent = null;
    private static PendingIntent pendingIntent = null;
    private static AlarmManager alarmManager = null;
    Calendar calendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimePicker tp = (TimePicker) findViewById(R.id.timePicker);
        final TextView alarmTime = (TextView) findViewById(R.id.alarmTime);
        alarmTime.setText("Hour: 0 Minute: 0 Val B: " + b);
        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int h, int m)
            {
                hour = view.getHour();
                minute = view.getMinute();
                alarmTime.setText("Hour: " + hour + " Minute: " + minute + " Val B: " + b);
                alarm.setAlarm(MainActivity.this, hour, minute);
            }
        }
        );

        alarmIntent = new Intent ( null, AlarmReceiver.class );
        pendingIntent = PendingIntent.getBroadcast( this.getApplicationContext(), 234324243, alarmIntent, 0 );
        alarmManager = ( AlarmManager ) getSystemService( ALARM_SERVICE );
        alarmManager.setRepeating( AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), alarmManager.INTERVAL_DAY, pendingIntent );
    }


}
