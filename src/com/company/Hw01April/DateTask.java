package com.company.Hw01April;

import java.time.*;
import java.util.Date;

public class DateTask {
    public static void main(String[] args)
    {
        Date date = new Date();

        DateToLocalDate(date);
        DateToLocalTime(date);
        DateToLocalDateTime(date);
    }


    public static LocalDate DateToLocalDate(Date date)
    {
        System.out.println(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()); //Для наглядності роботи методу.
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }


    public static LocalTime DateToLocalTime(Date date)
    {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }


    public static LocalDateTime DateToLocalDateTime(Date date)
    {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
