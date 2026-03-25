import java.util.Scanner;

class BMI_Index{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.print("Enter the height in cm : ");
int height= input.nextInt();

System.out.print("Enter the weight in kg: ");
int weight= input.nextInt();

double height_meter = height/100.0;

double BMI = weight/(height_meter*height_meter);

System.out.printf("Your BMI: %.2f\n", BMI);

if ( BMI <= 18.4){
System.out.print("Weight status: Underweight");
}
else if ( BMI <=24.9 && BMI>=18.5){
	System.out.print("Weight status: Normal");
}
else if ( BMI <=39.9 && BMI>=25){
	System.out.print("Weight status: Overweight");	
}
else if ( BMI>=40.0){
	System.out.print("Weight status: Obese");
}

input.close();
}
}