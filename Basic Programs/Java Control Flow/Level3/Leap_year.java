import java.util.Scanner;

class Leap_year{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a year ");
int year = input.nextInt();

if ( year >=1582){
if ( year % 400 == 0 ) {
System.out.print("It is a leap year ");
}
else if (year % 100 == 0 ) {
System.out.print("It is not a leap year ");
}
else if (year % 4 == 0){
System.out.print("It is a leap year");
}
else {
	System.out.print("It is not a leap year");
}
}
else {
	System.out.print("Year must be later than 1582 or georgian rules");
}
	input.close();
}
}