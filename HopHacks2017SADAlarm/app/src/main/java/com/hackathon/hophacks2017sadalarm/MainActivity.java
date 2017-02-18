package com.hackathon.hophacks2017sadalarm;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    public AlarmReceiver alarm = new AlarmReceiver();
    public static int hour, minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimePicker tp = (TimePicker) findViewById(R.id.timePicker);
        final TextView alarmTime = (TextView) findViewById(R.id.alarmTime);
        tp.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int h, int m) {
                alarm.cancelAlarm(MainActivity.this);
                hour = view.getHour();
                minute = view.getMinute();
                alarmTime.setText("Hour: " + hour + " Minute: " + minute);
                alarm.setAlarm(MainActivity.this);
            }
        }
        );
    }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minuteOfHour)
    {

        hour = view.getHour();
        minute = view.getMinute();
        alarm.setAlarm(this);

        TextView tv1 = (TextView) findViewById(R.id.alarmTime);
        tv1.setText("Hour: " + hour + " Minute: " + minute);

    }


}
