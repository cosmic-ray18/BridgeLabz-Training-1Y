import java.util.Scanner;

class Milesconverter {

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Distance in km: ");
double kms = sc.nextDouble();

double Miles = kms*0.621371;

System.out.print(Miles);

sc.close();

 }
} 