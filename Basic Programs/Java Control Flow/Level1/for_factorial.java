import java.util.Scanner;

class for_factorial{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number ");
int num = input.nextInt();
long factorial = 1;

for (int i = num ; i>0;i--){
 factorial *= i;
}

System.out.println(factorial);

input.close();
}
}