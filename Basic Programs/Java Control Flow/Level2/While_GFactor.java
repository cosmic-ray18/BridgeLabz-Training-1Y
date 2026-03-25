import java.util.Scanner;

class While_GFactor{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number ");
int num = input.nextInt();

int greatestfactor;
int counter = num-1;

while(counter >0 ){
if ( num % counter  == 0) {
	greatestfactor = counter;
System.out.println(greatestfactor);
break;
}
counter--;
}

input.close();
}
}