package main.EmpWageProblems;

public class UC5WageForAMonth {
    public static void main(String[] args) {

        //constants
        int IS_PRESENT=1;
        int IS_ABSENT=2;
        int EMP_RATE_PER_HR=20;
        int TOTAL_WORKING_DAYS=20;

        //variables;
        int empHrs;
        int totalEarnings=0;
        int dailyWage;
        int empDays=0;

        for (int i=0; i<TOTAL_WORKING_DAYS; i++){
            int random=(int)Math.floor(Math.random()*10)%3;
            empDays++;
            switch (random){
                case 1:
                    empHrs=8;
                    dailyWage=empHrs*EMP_RATE_PER_HR;
                    totalEarnings=totalEarnings+dailyWage;
                    System.out.println("Earning till Day "+empDays+" is: " + totalEarnings);
                    break;
                case 2:
                    empHrs=4;
                    dailyWage=empHrs*EMP_RATE_PER_HR;
                    totalEarnings=totalEarnings+dailyWage;
                    System.out.println("Earning till Day "+empDays+" is: " + totalEarnings);
                    break;
                default:
                    empHrs=0;
                    dailyWage=empHrs*EMP_RATE_PER_HR;
                    totalEarnings=totalEarnings+dailyWage;
                    System.out.println("Earning till Day "+empDays+" is: " + totalEarnings);
                    break;
            }
        }
        System.out.println("Employee has earned "+ totalEarnings+" in a month");
    }
}
