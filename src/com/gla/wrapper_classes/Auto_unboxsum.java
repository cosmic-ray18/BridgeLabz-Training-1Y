import java.util.ArrayList;

class Auto_unboxsum{
    public static void main (String[] args){

        int sum = 0;
        //Creating ArrayList<Integer>
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0;i<5;i++){
            list.add(i); //Autoboxing
        }
        for (int i = 0;i<5;i++){
            sum += list.get(i); //Auto-Unboxing
        }

        System.out.println("Sum of numbers: " + sum);
    }
}