import java.util.Scanner;

class result_comparison{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

int sum1 = 0;
int sum2 = 0;
System.out.println("Enter a Number ");
int num = input.nextInt();

if (num>0){
	sum1 = num*(num+1)/2;
}
while (num>0){
	sum2 += num;
	num--;
}

System.out.println(sum1);
System.out.print(sum2);

input.close();
}
}