import java.util.Scanner;

class Digit_counter{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.print("Enter the Number: ");
int num= input.nextInt();

int count = 0;

while (num!= 0){
num = num/10;
count++;
}

System.out.print("Total number of digits in num: " + count);

input.close();
}
}

