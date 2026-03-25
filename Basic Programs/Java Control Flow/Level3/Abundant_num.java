import java.util.Scanner;

class Abundant_num{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.print("Enter the Number: ");
int num= input.nextInt();

int sum = 0;
int counter = 1 ;

while (counter<num){
if ( num % counter == 0){
sum += counter;
}
counter++;
}


if (sum > num){
System.out.print(sum +" > "+num +"\nIt is an Abundant number");
}
else {
System.out.print(sum+" <= "+num+"\nIt is not an Abundant number");
}

input.close();
}
}