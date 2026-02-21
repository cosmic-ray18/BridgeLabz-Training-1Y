import java.util.Scanner;

class For_Factor{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number ");
int num = input.nextInt();

if (num>0){

for (int i=1;i<=num;i++){
if (num%i== 0){
System.out.println(i + " is a factor of num ");
}
}
}

input.close();
}
}