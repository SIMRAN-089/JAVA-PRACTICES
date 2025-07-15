import java.util.*;

public class SnackSearch {
    public static int linearSearch(String[] snacks, String key) {
        for (int i = 0; i < snacks.length; i++) {
            if (snacks[i]==key) {  
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] snacks = {"Chips", "Cookies", "Samosa", "Burger", "Fries"};
        String key = "pepsi";

        int index = linearSearch(snacks, key);
        if (index == -1) {
            System.out.println("Snack not found.");
        } else {
            System.out.println("Snack found at index: " + index);
        }
    }
}
