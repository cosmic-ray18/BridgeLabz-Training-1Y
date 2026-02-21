import java.util.Scanner;

class youngest_largest{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter The age of 1st Friend ");
int age1 = input.nextInt();

System.out.println("Enter The age of 2nd Friend ");
int age2 = input.nextInt();

System.out.println("Enter The age of 3rd Friend ");
int age3 = input.nextInt();

if ( age1 < age2 && age 1 < age3){
System.out.println("1st Friend is youngest ");
}
else if ( age2<age3 && age2<age1){
System.out.println("2nd Friend is youngest ");
}
else {
System.out.println("3rd Friend is youngest ");
}

System.out.println("Enter The height of 1st Friend ");
double height1 = input.nextDouble();

System.out.println("Enter The height of 2nd Friend ");
double height2 = input.nextDouble();

System.out.println("Enter The height of 3rd Friend ");
double height3 = input.nextDouble();

if ( height1 > height2 && height 1 > height3){
System.out.println("1st Friend is largest ");
}
else if ( height2 >height3 && height2>height1){
System.out.println("2nd Friend is largest ");
}
else {
System.out.println("3rd Friend is largest ");
}

input.close();

}
}
