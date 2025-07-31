public int search(int[] nums, int target) {
    int start = 0, end = nums.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        // Direct hit
        if (nums[mid] == target) return mid;

        // Left half is sorted
        if (nums[start] <= nums[mid]) {
            if (nums[start] <= target && target < nums[mid]) {
                end = mid - 1; // search in left half
            } else {
                start = mid + 1; // search in right half
            }
        }
        // Right half is sorted
        else {
            if (nums[mid] < target && target <= nums[end]) {
                start = mid + 1; // search in right half
            } else {
                end = mid - 1; // search in left half
            }
        }
    }

    return -1; // not found
}
