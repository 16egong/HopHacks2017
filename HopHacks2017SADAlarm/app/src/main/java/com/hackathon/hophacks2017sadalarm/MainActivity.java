package com.hackathon.hophacks2017sadalarm;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public AlarmReceiver alarm = new AlarmReceiver();
    public static int hour, minute;
    public static int b = 0;

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
    }


}
