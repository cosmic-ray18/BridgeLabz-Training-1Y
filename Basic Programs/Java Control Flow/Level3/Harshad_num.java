import java.util.Scanner;

class Harshad_num{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.print("Enter the Number: ");
int num= input.nextInt();

int sum = 0;
int original_num = num;

while (original_num!= 0){

int digit = original_num % 10;
sum += digit;
original_num = original_num/10;
}

if ( num % sum == 0 ){
System.out.print("It is a Harshad number");
}
else{
System.out.print("It is not a Harshad number");
}

input.close();

}
}
