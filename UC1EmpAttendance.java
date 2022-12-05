package main.EmpWageProblems;

public class UC1EmpAttendance {
    public static void main(String[] args) {

        // CONSTANT VARIABLE
        int IS_FULL_TIME=1;

        // variable values
        int random=(int) Math.floor(Math.random()*10)%3;
        System.out.println(random);

        if (random == IS_FULL_TIME){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}
