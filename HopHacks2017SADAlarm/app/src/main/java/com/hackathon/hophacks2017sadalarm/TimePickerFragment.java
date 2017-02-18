package com.hackathon.hophacks2017sadalarm;

import android.app.TimePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;
import android.widget.TimePicker;
import android.support.v4.app.DialogFragment;

import java.util.Calendar;

/**
 * Created by achee on 2/18/2017.
 */

public class TimePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener
{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current alarm as the default values for the picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(MainActivity.hour);
        int minute = c.get(MainActivity.minute);

        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity()));
    }

    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        MainActivity.hour = view.getHour();
        MainActivity.minute = view.getMinute();
        // Do something with the time chosen by the user
        TextView tv1=(TextView) getActivity().findViewById(R.id.alarmTime);
        tv1.setText("Hour: "+view.getHour()+" Minute: "+view.getMinute());

    }

}
