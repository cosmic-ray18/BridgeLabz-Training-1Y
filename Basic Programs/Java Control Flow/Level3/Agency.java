import java.util.Scanner;

class Agency{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter the Marks of Physics , chemistry and Maths from 100 respectively");
int Physics = input.nextInt();
int Chemistry = input.nextInt();			
int Maths = input.nextInt();

double Percentage = ((Physics + Chemistry + Maths)*100)/300.0;

if ( Percentage >= 80) {
System.out.print("Grade:A" + " (Level-4 ,above agency-normalized standards " + "Remarks:" + Percentage + "%");
}
else if ( Percentage < 80 && Percentage>=70) {
System.out.print("Grade:B" + " (Level-3 ,at agency-normalized standards " + "Remarks:" + Percentage + "%");
}
else if ( Percentage < 70 && Percentage>=60) {
System.out.print("Grade:C" + " (Level-2 ,below,but approaching agency-normalized standards " + "Remarks:" + Percentage + "%");
}
else if ( Percentage < 60 && Percentage>=50) {
System.out.print("Grade:D" + " (Level-1 ,well below agency-normalized standards " + "Remarks:" + Percentage + "%");
}
else if ( Percentage < 50 && Percentage>=40) {
System.out.print("Grade:E" + " (Level-1 ,too below agency-normalized standards " + "Remarks:" + Percentage + "%");
}
else if (Percentage < 40 ) {
System.out.print("Grade:R" + " Remedial Standards " + "Remarks:" + Percentage + "%");
}

input.close();

}
}