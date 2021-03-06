package com.example.drmarker.Step;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;


public class DateTimeHelper {

    public static Date getToday()
    {
        Date d=new Date();
        return new Date(d.getYear(),d.getMonth(),d.getDate());
    }

    public static Date add(Date d,int n)
    {
        Calendar c=Calendar.getInstance();
        c.setTime(d);
        c.add(Calendar.DAY_OF_MONTH,n);
        return c.getTime();

    }

    public static Date[] get6days()
    {
        Date d=getToday();
        Date [] days=new Date[6];
        for (int i=0;i<6;i++)
        {
            days[i]=add(d,i-5);
        }
        return days;
    }

    public static int getHour(){
        long time = System.currentTimeMillis();
        final Calendar c = Calendar.getInstance();
        c.setTimeInMillis(time);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        return hour;



    }

    public static String[] get6days(boolean returnString)
    {
        Date d=getToday();


        String [] days=new String[6];
        for (int i=0;i<6;i++)
        {
            Date t=add(d,i-5);
            days[i]=t.getMonth()+1+"."+t.getDate();
        }
        return days;
    }
}
