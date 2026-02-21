import java.util.Scanner;

class While_fizzbuzz{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number ");
int num = input.nextInt();


while(num>0){
if (num%3 == 0 && num%5 == 0 ){
System.out.println(num + " = Fizzbuzz");
}
else if (num%5 == 0){
System.out.println(num +" = Buzz");
}
else if (num %3 == 0 ){
System.out.println(num +" = Fizz");
}
num--;
}

 input.close();
 }
 }