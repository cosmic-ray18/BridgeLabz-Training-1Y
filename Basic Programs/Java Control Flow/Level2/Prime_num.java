import java.util.Scanner;

class Prime_num{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number to check it is Prime or not ");
int num = input.nextInt();

boolean isPrime;

if (num>1){
for (int i = 2; i <num ; i++){
if ( num % i == 0) {
System.out.println(isPrime);
break;
}
else {
	isPrime = true ;
	System.out.print(isPrime);
}

}

input.close();
}
}