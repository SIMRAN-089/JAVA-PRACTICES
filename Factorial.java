// Java program to find factorial using recursion
import java.util.Scanner;

public class Factorial {
    // Recursive method
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        } else {
            return n * factorial(n - 1); // recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long result = factorial(num);

        System.out.println("Factorial of " + num + " is: " + result);
        
        sc.close();
    }
}
