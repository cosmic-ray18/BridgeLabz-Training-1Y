import java.util.Scanner;

class For_fizzbuzz{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number ");
int num = input.nextInt();

if ( num > 0){

for (int i=1;i<=num;i++){
if (i%3 == 0 && i%5 == 0 ){
System.out.println(i + " = Fizzbuzz");
}
else if (i%5 == 0){
System.out.println(i +" = Buzz");
}
else if (i%3 == 0 ){
System.out.println(i +" = Fizz");
}
}
}
 input.close();
 }
 }