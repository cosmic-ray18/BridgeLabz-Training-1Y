import java.util.Scanner;

public class freq_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int n2 = n;
        int count = 0;
        int index = 0;

        while (n2 != 0) {
            n2 = n2 / 10;
            count++;
        }

        int[] arr = new int[count];
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            arr[index] = digit;
            index++;
        }

        int[] processed = new int[count];
        for (int i = 0; i < count; i++) {
            int z = 0;
            for (int k = 0; k < count; k++) {
                if (arr[i] == processed[k]) {
                    z++;
                    continue;
                }
            }

            if (z > 0) {
                continue;
            }

            int frequency = 0;
            for (int j = 0; j < count; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }

            System.out.println(arr[i] + " has frequency: " + frequency);
            processed[i] = arr[i];
        }
        sc.close();
    }
}