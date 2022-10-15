package com.empwage;

public class EmpWageUC4 {

    public static void main(String[] args) {

        //  Constants
        final int Is_Present = 1;
        final int Is_PartTime = 2;
        final int EmpRatePerHour = 20;

        // Variables
        int empHrs ;
        int empWage ;


        int max=2 , min=0 ;
        int empCheck = (int)(Math.random()*(max-min+1)+min);

        // checking conditions(Switch)

        switch (empCheck) {

            case Is_Present:
                System.out.println("Employee is Present");
                empHrs = 8;
                break;

            case Is_PartTime:
                System.out.println("Employee is PartTime");
                empHrs = 4;
                break;

            default:
                System.out.println("Employee is Absent");
                empHrs = 0;
        }
            //Computation
        empWage = empHrs * EmpRatePerHour ;
        System.out.println("Employee Wage = "+empWage);

    }
}

