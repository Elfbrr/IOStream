package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeClass {
    public static void main(String[] args) {
        System.out.println("LocalDate.now() = " + LocalDate.now());
        System.out.println("LocalTime.now() = " + LocalTime.now());
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());

        LocalDate date = LocalDate.now(); //2023-01-12
        LocalDate result = date.plusDays(25); //it adds the number that you enter here to today's date ==>2023-01-12
        System.out.println("result = " + result);//2023-02-06

        LocalDate inquiryExpireDate= date.plusMonths(24);//2023-01-12
        System.out.println("inquiryExpireDate = " + inquiryExpireDate);//2025-01-12


        LocalDate newYear=date.plusYears(3);//2023-01-12
        System.out.println("newYear = " + newYear);//2026-01-12

        //Minus 25 days
        result=date.minusDays(25); //2023-01-12
        System.out.println("result = " + result);//2022-12-18

        LocalDateTime now = LocalDateTime.now();
        ZoneId currentZone=ZoneId.systemDefault();

    }


}
