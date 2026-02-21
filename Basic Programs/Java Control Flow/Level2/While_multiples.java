import java.util.Scanner;

class While_multiples{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number ");
int num = input.nextInt();

if (num>0  && num <100){
int counter = 99;
while(counter > num  ){
	counter--;
if ( counter % num == 0) {
System.out.println(counter  + " is a multiple of num");
continue;
}

}
}

input.close();
}
}