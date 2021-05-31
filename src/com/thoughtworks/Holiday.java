package com.thoughtworks;

import java.util.ArrayList;

public class Holiday {
    private String name;
    private int day;
    private String month;
    public Holiday(){}
    public Holiday(String name, int day, String month)
    {
       this.name = name;
       this.day = day;
       this.month = month;
    }
    public boolean isSameMonth(Holiday firstHoliday, Holiday secondHoliday)
    {
        return firstHoliday.month.equals(secondHoliday.month);
    }
    public double avgDate(ArrayList<Holiday> holidays)
    {
        double sum=0;
        for(Holiday i: holidays)
            sum += i.day;
        return sum/ holidays.size();

    }
    public static void main(String[] args)
    {
        ArrayList<Holiday> holidays = new ArrayList<>();
        Holiday holiday = new Holiday();
        Holiday firstHoliday = new Holiday("Independence Day",4,"July");
        Holiday secondHoliday = new Holiday("Republic Day",26,"January");
        holidays.add(firstHoliday);
        holidays.add(secondHoliday);
        System.out.println(holiday.isSameMonth(firstHoliday,secondHoliday));
        System.out.println(holiday.avgDate(holidays));
    }
}
