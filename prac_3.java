import java.util.Scanner;

public class prac_3 {
    
    
    public static int findMax(int[] arr) {
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    
        int maxValue = findMax(arr);
        System.out.println("The maximum value is: " + maxValue);
    }
}
