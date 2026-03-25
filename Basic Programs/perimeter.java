import java.util.Scanner;

class perimeter {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("LENGTH: ");
int length = sc.nextInt();

System.out.print("WIDTH: ");
int width = sc.nextInt();


int Peri = 2*(length+width);

System.out.println(Peri);
 
 }
} 