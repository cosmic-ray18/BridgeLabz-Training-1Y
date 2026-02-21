import java.util.Scanner;

class While_rocketlaunch { 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("COUNTDOWN NUMBER ");
int counter = input.nextInt();

while ( counter >= 0){
System.out.println(counter);
counter--;
}

input.close();
}
}