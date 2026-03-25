import java.util.Scanner;

class Switch_case{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.print("Enter the value of variables: ");
double first= input.nextDouble();
double Second= input.nextDouble();
String op = input.next();

System.out.print("How many times you want to calculate: ");
int num = input.nextInt();

 for (int i = 0 ; i<num;i++){
 switch (op){
 case "+":
 System.out.println("Result: " + (first+Second));
 break;
  case "-":
 System.out.println("Result: " + (first-Second));
 break;
  case "*":
 System.out.println("Result: " + (first*Second));
 break;
  case "/":
  if (Second!=0){
 System.out.println("Result: " + (first/Second));
 }
 else {
 System.out.println("Error.division by zero");
 }
 break;
 default:
 System.out.println("Invalid operator");
 break;
 }
 }
 
 
 input.close();
 
 }
 }
 