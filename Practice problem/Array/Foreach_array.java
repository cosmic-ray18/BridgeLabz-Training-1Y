public class Foreach_array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
		
		System.out.println("Update array elements");
        arr[0] = 50; // Updating an element
        
        System.out.println("For-each Example: ");
        for (int num : arr) {
            System.out.println(num);
        } 
    }
}