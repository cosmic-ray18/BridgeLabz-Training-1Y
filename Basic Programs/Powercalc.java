import java.util.Scanner;

class Powercalc {

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Base: ");
int base = sc.nextInt();

System.out.println("Exponent:");
int exponent = sc.nextInt();

double result = Math.pow(base , exponent);

System.out.println(result);

sc.close();
 
 }
} 