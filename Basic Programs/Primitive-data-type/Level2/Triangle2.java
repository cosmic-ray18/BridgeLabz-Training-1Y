import java.util.Scanner;

class Trianlge2 { 
public static void main (String [] args ) { 

Scanner input = new Scanner(System.in);

System.out.println(" Height and Base of Triangle in cms: " );

float height = input.nextFloat();
float Base  = input.nextFloat();
double inch_h = height/2.54;
double inch_b = Base /2.54;

double cms_area = 1.0/2.0*height*Base;
double inch_area = 1.0/2.0*inch_h*inch_b;

System.out.print("Area of Triangle in square inches is " + inch_area + " and square centimeters is " + cms_area);
 
 }
} 