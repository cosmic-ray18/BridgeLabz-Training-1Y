import java.util.Scanner;

class Prime_num{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number to check it is Prime or not ");
int num = input.nextInt();

boolean isPrime ;

if (num>1){
	isPrime = true;
for (int i = 2; i <num ; i++){
if ( num % i == 0) {
isPrime = false;
break;
}
}
System.out.print(isPrime);
}
else if (num<1){
	isPrime = false;
	System.out.print(isPrime);
}
else {
	isPrime = false;
	System.out.print(isPrime);
}

input.close();
}
}