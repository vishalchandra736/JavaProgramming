package com.blz.javaprogramming;

public class EmployeeWageComputation {
    public static void main(String[] args) {
      int wagePerHour = 20;
      int fullDayHour = 8;
      int partTimeHour = 4;
      int attendence, dailyEmployeeWage;
      System.out.println("Welcome to Employee Wage Computation Program");
      attendence = (int)(Math.random() * 10 % 2);
      switch(attendence) {
          case 1: System.out.println("Employee is Present");
                  System.out.println("There are Two type of Employment - 1) Full-Time   2) Part-Time");
                  dailyEmployeeWage = wagePerHour * fullDayHour;
                  System.out.println("Full-Time Daily Employee Wage is " + dailyEmployeeWage);
                  dailyEmployeeWage = wagePerHour * partTimeHour;
                  System.out.println("Part-Time Daily Employee Wage is " + dailyEmployeeWage);
                  break;
          case 0: System.out.println("Employee is Absent, No Wage is Produce");
                  break;
      }

    }
}
