import java.util.Scanner;

public class PCM_gradearray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int num = sc.nextInt();
        double[][] studentmarks= new double[num][3];
        String[] weightstatus = new String[num];

        for (int i = 0; i < persondata.length; i++) {
            System.out.println("person " + (i + 1) + ": ");
            System.out.print("Enter the weight: ");
            persondata[i][0] = sc.nextDouble();
            System.out.print("Enter the height: ");
            persondata[i][1] = sc.nextDouble();
            persondata[i][1] = persondata[i][1]/100;
            persondata[i][2] = persondata[i][0]/(persondata[i][1]*persondata[i][1]);
            if (persondata[i][2] <= 18.4) {
                weightstatus[i] = "Underweight";
            } else if (persondata[i][2] >= 18.5 && persondata[i][2] <= 24.9) {
                weightstatus[i] = "Normal";
            } else if (persondata[i][2] >= 25 && persondata[i][2] <= 39.9) {
                weightstatus[i] = "Overweight";
            } else {
                weightstatus[i] = "obese";
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println("person " + (i + 1) + ": ");
            System.out.print("Weight: ");
            System.out.println(persondata[i][0]);
            System.out.print("Height: ");
            System.out.println(persondata[i][1]);
            System.out.print("BMI: ");
            System.out.printf("%.2f", persondata[i][2]);
            System.out.println();
            System.out.print("status: ");
            System.out.println(weightstatus[i]);
        }
        sc.close();
    }
}

}
