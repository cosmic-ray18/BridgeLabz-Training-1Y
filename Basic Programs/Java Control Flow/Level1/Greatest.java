import java.util.Scanner;

class Greatest { 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("INPUT THE NUMBERS:");
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();

if (a>b && a>c){
System.out.print("First number is the largest in 3 Numbers");
}
else if (b>c && b>a){
System.out.print("Second number is the largest in 3 Numbers");
}

	System.out.print("Third number is the largest in 3 Numbers");
	

input.close();
 }
} 