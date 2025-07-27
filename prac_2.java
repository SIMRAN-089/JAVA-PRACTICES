import java.util.*;

public class prac_2 {
    public static int maxTripletProduct(int numbers[]) {
        Arrays.sort(numbers);  
        int n = numbers.length;

        if (n < 3) {
            return -1; 
        }

        
        int product1 = numbers[n - 1] * numbers[n - 2] * numbers[n - 3]; 
        int product2 = numbers[0] * numbers[1] * numbers[n - 1];         

        
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int numbers[] = {10, 3, 5, 6, 20};
        System.out.println("Maximum product of any triplet is: " + maxTripletProduct(numbers));
    }
}
