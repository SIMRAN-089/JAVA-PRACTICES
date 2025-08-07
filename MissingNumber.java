public class MissingNumber {
    public static int findMissing(int[] arr) {
        int n = arr.length;
        int totalSum = n * (n + 1) / 2; // sum of 0 to n
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println("Missing Number: " + findMissing(arr));
    }
}
