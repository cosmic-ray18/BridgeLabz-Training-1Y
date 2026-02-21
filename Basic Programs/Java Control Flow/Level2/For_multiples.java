import java.util.Scanner;

class For_multiples{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number ");
int num = input.nextInt();

if (num>0 && num <100){
for (int i = num ; i <100; i++){
if ( i % num == 0) {
System.out.println(i + " is a multiple of num");
continue;
}
}
}

input.close();
}
}