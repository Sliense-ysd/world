package com.example.date_time;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.nio.charset.MalformedInputException;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    int year,month,day,hour,minute;

//    private  void edit_show(int year,int month,int day,int hour,int minute){
//        String str=year+"年"+month+"月"+day+"日"+minute+"分钟";
//        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        DatePicker d1=(DatePicker)findViewById(R.id.d1);
//        TimePicker t1=(TimePicker)findViewById(R.id.t1);
//
//        t1.setIs24HourView(true);
//
//        Calendar c1=Calendar.getInstance();
//        year=c1.get(Calendar.YEAR);
//        month =c1.get(Calendar.MONTH);
//        day=c1.get(Calendar.DAY_OF_MONTH);
//        hour=c1.get(Calendar.HOUR);
//        minute =c1.get(Calendar.MINUTE);
//
//        d1.init(year, month, day, new DatePicker.OnDateChangedListener() {
//            @Override
//            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//                MainActivity.this.year=year;
//                MainActivity.this.month=month;
//                MainActivity.this.day=day;
//                edit_show(year,month,day,hour,minute);
//
//            }
//        });
    }


}