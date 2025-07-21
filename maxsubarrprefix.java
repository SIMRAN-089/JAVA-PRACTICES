public class maxsubarrprefix {
    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

    
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = prefix[0];
        int minPrefix = 0;

    
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, prefix[i] - minPrefix);
            minPrefix = Math.min(minPrefix, prefix[i]);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {4, -2, -8, 5, -2, 7, 7, 2, -6, 5};
        int result = maxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}

