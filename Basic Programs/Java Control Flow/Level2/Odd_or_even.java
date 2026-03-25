import java.util.Scanner;

class Odd_or_Even{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number ");
int num = input.nextInt();

if(num>0){
for (int i=1;i<=num;i++){
if (num%2==0){
System.out.println(i + " is an even number ");
}
else{
System.out.print(i + " is an odd number ");
}
}
}
input.close();

}
}
