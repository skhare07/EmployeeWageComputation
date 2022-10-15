package com.empwage;

public class EmpWageUC5 {

    public static void main(String[] args) {

        //  Constants
        final int Is_Present = 1;
        final int Is_PartTime = 2;
        final int EmpRatePerHour = 20;
        final int NumberofWorkingDays = 20;
        // Variables
        int empHrs ;
        int empWage=0 ;
        int TotalEmpWage=0;

        int max=2 , min=0 ;

        for (int day =0 ; day<NumberofWorkingDays ; day++) {
            int empCheck = (int) (Math.random() * (max - min + 1) + min);
            switch (empCheck) {

                case Is_Present:
                    //System.out.println("Employee is Present");
                    empHrs = 8;
                    break;

                case Is_PartTime:
                  //  System.out.println("Employee is PartTime");
                    empHrs = 4;
                    break;

                default:
                    //System.out.println("Employee is Absent");
                    empHrs = 0;
            }
            //Computation
            empWage = empHrs * EmpRatePerHour;
            TotalEmpWage = TotalEmpWage + empWage;
            System.out.println("Employee Wage day " +(day+1)+ "= " +empWage);

           }
        System.out.println("Total Employee Wage = " +TotalEmpWage);

    }
}

