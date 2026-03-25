import java.util.Scanner;

class Distance2 {
public static void main ( String[] args ){

Scanner input = new Scanner(System.in);

System.out.print(" Distance in feet: ");
double distanceinfeet = input.nextInt();

double yards = distanceinfeet/3;
double miles = yards/1760;

System.out.print("The distance in yards is " + yards + " while the distance in miles is " + miles);
 }
}