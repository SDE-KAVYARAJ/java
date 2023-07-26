import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        int startYear, endYear, i;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Start Year:");
        startYear = in.nextInt();

        System.out.println("Enter the End Year:");
        endYear = in.nextInt();


        System.out.println("Leap years:");


        for (i = startYear; i <= endYear; i++)
	 {
            if ( (0 == i % 4) && (0 != i % 100) || (0 == i % 400) ){
               System.out.println(i);
            }
        }
    }
}
