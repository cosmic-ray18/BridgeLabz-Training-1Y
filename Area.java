import java.util.Scanner;

public class Area {
     public static void main (String[] args ){
     Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Radius of Circle");
	 double radius = sc.nextDouble() ;
	 
	 double Area = (22.0/7.0* (radius*radius));
	 
	 System.out.println("Area of Circle: " + Area );
	 }
}
