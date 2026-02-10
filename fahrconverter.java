import java.util.Scanner;

public class fahrconverter {

  public static void main (String[] args){
  
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter the Temp in Celsius ");
   double cel = sc.nextDouble() ; 
   double fahrenheit = ((cel*9/5) + 32);
   
   System.out.println("Farenheit:" + fahrenheit );
    }
   }