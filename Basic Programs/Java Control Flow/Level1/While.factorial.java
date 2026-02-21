import java.util.Scanner;

class While_factorial{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number ");
int num = input.nextInt();
long factorial = 1;

while (num>0){
factorial *= num;
num--;
}
System.out.println(factorial);

input.close();
}
}