class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstIndex = findFirstOccurrence(nums, target);
        int lastIndex = findLastOccurrence(nums, target);
        return new int[]{firstIndex, lastIndex};
    }

    private int findFirstOccurrence(int[] nums, int target) {
        int low = 0;
        int z = nums.length;
        int high = z - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                if (mid == 0 || nums[mid - 1] != target) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; // Target not found
    }

    private int findLastOccurrence(int[] nums, int target) {
        int low = 0;
        int z = nums.length;
        int high = z - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                if (mid == z - 1 || nums[mid + 1] != target) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }

}
