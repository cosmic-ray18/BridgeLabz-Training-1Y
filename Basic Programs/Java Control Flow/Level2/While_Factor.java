import java.util.Scanner;

class While_Factor{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number ");
int num = input.nextInt();
int counter = 1;

while(counter <= num ) {
	if (num % counter == 0){
		System.out.println(counter + " is a factor of number " ) ;
	}
	counter++;
}

input.close();
}
}