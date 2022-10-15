package com.empwage;

public class EmpWageUC2 {
    public static void main(String[] args) {

        //  Variables
        int Is_Present = 1;
        int EmpRatePerHour = 20;
        int empHrs ;
        int empWage ;


        int max=1 , min=0 ;
        int empCheck = (int)(Math.random()*(max-min+1)+min);

        // checking conditions
        if(empCheck == Is_Present) {
            System.out.println("Employee is Present");
            empHrs = 8;
        }
        else {
            System.out.println("Employee is Absent");
            empHrs = 0;
        }
    //Computation
    empWage = empHrs * EmpRatePerHour ;
        System.out.println("Employee Wage = "+empWage);

    }
}

