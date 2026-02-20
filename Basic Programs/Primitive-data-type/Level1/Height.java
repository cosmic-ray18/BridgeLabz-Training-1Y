import java.util.Scanner;

class Height { 

public static void main ( String [] args ){ 

Scanner input = new Scanner(System.in);

System.out.print("Height in cms: ");
int cms = input.nextInt();

double inch = cms/2.54;
double feet = inch/12;

System.out.print("Your Height in cm is " + cms + " while in feet is " + feet + " and inches is " + inch);
 }
}