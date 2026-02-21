import java.util.Scanner;

class For_GFactor{ 

public static void main (String [] args ){

Scanner input = new Scanner(System.in);

System.out.println("Enter a Number ");
int num = input.nextInt();

int greatestfactor;

for (greatestfactor = num-1; greatestfactor > 0; greatestfactor--){
if ( num % greatestfactor == 0) {
System.out.println(greatestfactor);
break;
}
}

input.close();
}
}