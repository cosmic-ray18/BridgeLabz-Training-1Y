import java.util.Scanner;

class For_power{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number and power ");
int num = input.nextInt();
int power = input.nextInt();

int result = 1;

if ( num > 0 && power > 0) {
for (int i=1;i<=power;i++){
result *= num;
}
System.out.print(result);
}

input.close();
}
}