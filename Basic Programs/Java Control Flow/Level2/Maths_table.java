import java.util.Scanner;

class Maths_table{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number ");
int num = input.nextInt();

if ( num >=6 && num <= 9){

for (int i=0;i<=10;i++){
 int table = num*i;
 System.out.println(num+ "*" + i +"="+ table);
 }
}
 input.close();
 }
 }