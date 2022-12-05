package main.LineComparison;
import java.lang.*;
import java.util.*;

class UC2 {
    static int x1;
    static int y1;
    static int x2;
    static int y2;
    static int x3;
    static int y3;

    static int x4;
    static int y4;

    static int LengthOfLine1;
    static int LengthOfLine2;

    public static void main(String[] args) {

        //TAKING INPUTS FOR COMPUTING LINE 1
        System.out.println("Co-ordinates for line 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Co-ordinates x1 and y1: ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.print("Enter co-ordinates x2 and y2: ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        // CALCULATIONS FOR LINE1
        int ValOfx = (int) Math.pow((x2 - x1), 2);
        int ValOfy = (int) Math.pow((y2 - y1), 2);

        LengthOfLine1 = (int) Math.sqrt((ValOfx + ValOfy));
        // END OF CALCULATIONS FOR LINE 1

        // TAKING INPUTS FOR LINE 2
        System.out.println("Co-ordinates for line 2");
        System.out.print("Enter co-ordinates x3 and y3: ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();

        System.out.print("Enter co-ordinates x4 and y4: ");
        x4 = sc.nextInt();
        y4 = sc.nextInt();

        // CALCULATIONS FOR LINE 2
        int ValOfX = (int) Math.pow((x4 - x3), 2);
        int ValOfY = (int) Math.pow((y4 - y3), 2);

        LengthOfLine2 = (int) Math.sqrt((ValOfX + ValOfY));

        System.out.println(Objects.equals(LengthOfLine1, LengthOfLine2));
    }
}
