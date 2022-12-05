package main.LineComparison;
import java.util.*;

public class UC1 {
    public static void main(String[] args) {

        // TAKING CO-ORDINATES FOR POINT 1
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Co-ordinates x1 and y1: ");
        int x1=sc.nextInt();
        int y1= sc.nextInt();

        //TAKING CO-ORDINATES FOR POINT 2
        System.out.print("Enter Co-ordinates x2 and y2: ");
        int x2= sc.nextInt();
        int y2=sc.nextInt();

        // CALCULATIONS FOR GETTING THE LENGTH OF THE LINE WITH THE GIVEN TWO CO-ORDINATES
        int ValOfx=(int)Math.pow((x2-x1), 2);
        int ValOfy=(int)Math.pow((y2-y1), 2);

        int LengthOfLine=(int)Math.sqrt((ValOfx+ValOfy));

        // PRINTING OUT THE LENGTH
        System.out.println("Length Of the Line is: "+LengthOfLine);
    }
}
