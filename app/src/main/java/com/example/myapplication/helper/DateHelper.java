package com.example.myapplication.helper;

import java.text.SimpleDateFormat;
import  java.util.Date;

public  abstract class DateHelper {
    public  static String getFormatDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
