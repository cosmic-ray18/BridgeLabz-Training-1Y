import java.util.Scanner;

public class Searching_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40};
        
        System.out.println("Enter your element: ");
        int element = sc.nextInt();
        
      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Number found at idx:" + i);
            }
        }
        sc.close();
    }
}