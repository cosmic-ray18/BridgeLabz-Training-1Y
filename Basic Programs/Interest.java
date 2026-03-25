import java.util.Scanner;

class Interest { 

public static void main (String[] args_){

Scanner sc = new Scanner(System.in);

System.out.print("Principal: ");
double Principal = sc.nextInt();

System.out.print("Rate: ");
double Rate = sc.nextInt();

System.out.print("Time: ");
double Time = sc.nextInt();

double SI = (Principal*Rate*Time)/100.0;

System.out.println(SI);
 
 }
}
