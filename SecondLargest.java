import java.util.*;

public class SecondLargest {
    public static int getSecondLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 6, 7};
        System.out.println("Second largest distinct value is: " + getSecondLargest(numbers));
    }
}
