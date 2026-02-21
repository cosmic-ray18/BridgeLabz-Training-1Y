import java.util.Scanner;

class While_power{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number and power ");
int num = input.nextInt();
int power = input.nextInt();

int result = 1;
int counter = 1;

if ( num > 0 && power > 0) {
while ( counter <=power ) {
result *= num;
counter++;
}
}
System.out.print(result);

input.close();
}
}