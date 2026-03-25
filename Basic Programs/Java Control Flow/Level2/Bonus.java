import java.util.Scanner;

class Bonus{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.print("Enter the total service years: ");
int years = input.nextInt();
System.out.print("Enter the salary: ");
int salary = input.nextInt();

int bonus = 0;
if (years > 5){
bonus = (salary*5)/100;
System.out.print(bonus);
}
else {
	System.out.print("Sorry!You need to work for some more years");
}
input.close();

}
}
