import java.util.Scanner;

class Spring_season{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.print("INPUT THE DAY: ");
int day = input.nextInt();
System.out.print("INPUT THE MONTH: ");
int month = input.nextInt();

if (month == 3 && day >=20){
System.out.print("Its a Spring season");
}
else if (month > 3 && month < 6){
System.out.print("Its a Spring season");
}
else if (month == 3 && day <=20){
System.out.print("Its a Spring season");
}
else {
System.out.print("Not a Spring season");
}

input.close();
}
}