public class prac_23 {
    public static void main(String[] args) {
        int number = 5;   // You can change this number to test
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
