import java.util.Scanner;

class Not_zero{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

double total = 0.0;

System.out.println("Enter a Number ");

double number = input.nextDouble();
while (number != 0 && number >0){
total += number;
number = input.nextDouble();
}
System.out.print(total);

input.close();

}
}
