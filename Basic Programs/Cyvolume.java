 import java.util.Scanner;

class Cyvolume { 
 
 public static void main (String[] args) {
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Height of a Cyliner :");
 int height = sc.nextInt();
 
 System.out.println("Radius of a Cylinder:");
 int radius = sc.nextInt();
 
 double Volume = 22.0/7*(radius*radius)*height;
 
 System.out.println(Volume);
 
 }
}