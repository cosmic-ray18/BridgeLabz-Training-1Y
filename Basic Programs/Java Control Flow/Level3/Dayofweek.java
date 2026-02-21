import java.util.Scanner;

class Dayofweek {

public static void main(String[] args ){

Scanner input = new Scanner(System.in);

System.out.println("Write the Date by giving day , month and year respectively");
int d = input.nextInt();
int m = input.nextInt();
int y = input.nextInt();

System.out.println("Date: " + d + "|" + m + "|" + y);

int y_o = y-(14-m)/12;
int x = y_o + y_o/4 - y_o/100 + y_o/400;
int m_o = m+12*((14-m)/12)-2;
int d_0 = (d+x+31*m_o/12)%7;

System.out.print("Day of week: " + d_0);
}
}