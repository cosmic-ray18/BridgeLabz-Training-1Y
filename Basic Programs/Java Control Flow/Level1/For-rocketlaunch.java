import java.util.Scanner;

class For_rocketlaunch { 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("COUNTDOWN NUMBER ");
int counter = input.nextInt();

for (int i = counter ; i>= 0;i--){
System.out.println(i);
}

input.close();
}
}