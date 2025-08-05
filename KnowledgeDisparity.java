import java.util.*;

public class KnowledgeDisparity {
    public static int getKnowledgeDisparity(int[] expertise) {
        Arrays.sort(expertise);
        int n = expertise.length;
        int minDisparity = Integer.MAX_VALUE;

        // Iterate over possible middle group indexes
        for (int mid = 1; mid < n - 1; mid++) {
            int a2 = expertise[mid];

            // Nearest a1 (left group)
            int a1 = expertise[mid - 1];

            // Nearest a3 (right group)
            int a3 = expertise[mid + 1];

            // Calculate disparity
            int disparity = Math.abs(a1 - a2) + Math.abs(a2 - a3);
            minDisparity = Math.min(minDisparity, disparity);
        }

        return minDisparity;
    }

    public static void main(String[] args) {
        int[] expertise = {5, 4, 7, 1, 9};
        System.out.println(getKnowledgeDisparity(expertise)); // Output: 3
    }
}
