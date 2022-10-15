package com.empwage;

public class EmpWageUC6 {

    public static void main(String[] args) {

        //  Constants
        final int Is_Present = 1;
        final int Is_PartTime = 2;
        final int EmpRatePerHour = 20;
        final int NumberofWorkingDays = 20;
        final int TotalWorkingHours = 100;

        // Variables
        int empHrs ;
        int empWage=0 ;
        int TotalEmpWage=0;
        int TotalEmpHours=0;
        int TotalWorkingDays=0;
        int max=2 , min=0 ;

        while(TotalEmpHours <= TotalWorkingHours && TotalWorkingDays < NumberofWorkingDays  ) {
            TotalWorkingDays++;

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
             TotalEmpHours += empHrs;
             System.out.println("Days = "+TotalWorkingDays+ " and Hours ="+TotalEmpHours);

        }
            TotalEmpWage = TotalEmpHours * EmpRatePerHour;



        System.out.println("Total Employee Wage = " +TotalEmpWage);

    }
}

