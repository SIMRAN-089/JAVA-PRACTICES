import java.util.*;

public class prac_6 {
    public static int rotatedsearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            // Left half is sorted
            if (numbers[start] <= numbers[mid]) {
                if (key >= numbers[start] && key < numbers[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (key > numbers[mid] && key <= numbers[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int numbers[] = {4, 5, 6, 7, 0, 1, 2}; // Rotated sorted array
        int key = 0;

        System.out.println("Index for key is: " + rotatedsearch(numbers, key));
    }
}
