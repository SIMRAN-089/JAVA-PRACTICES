import java.util.PriorityQueue;
import java.util.Scanner;

public class q2 {
    public static int findKthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        
        for (int num : arr) {
            minHeap.add(num);
        }

        
        for (int i = 1; i < k; i++) {
            minHeap.poll();
        }

        
        return minHeap.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        if (k > 0 && k <= n) {
            int kthSmallest = findKthSmallest(arr, k);
            System.out.println(k + "th smallest element is: " + kthSmallest);
        } else {
            System.out.println("Invalid value of k.");
        }

        sc.close();
    }
}
