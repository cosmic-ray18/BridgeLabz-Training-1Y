import java.util.Scanner;

class Distance {
public static void main ( String[] args ){

Scanner input = new Scanner(System.in);

System.out.print(" Distance in feet: ");
double distanceinfeet = input.nextInt();

double yards = distanceinfeet/3;
double miles = yards/1760;

System.out.print("The distance in feet is " + distanceinfeet + " while in yards is " + yards + " and miles is " + miles);
 }
}