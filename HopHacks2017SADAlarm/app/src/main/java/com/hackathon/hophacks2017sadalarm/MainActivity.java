package com.hackathon.hophacks2017sadalarm;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TimePickerDialog.OnTimeSetListener {

    AlarmReceiver alarm = new AlarmReceiver();
    public static int hour, minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
