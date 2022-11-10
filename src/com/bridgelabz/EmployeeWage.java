package com.bridgelabz;
public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("Welcome to employee wage computation. ");

        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage = 0;
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 2;

        if (employeeCheck == 1) {
            dailyWage = fullDayHour * wagePerHour;
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
        System.out.println("employee daily wage is: " + dailyWage);
    }
}