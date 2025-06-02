public class Solution {

    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {1, 2, 3, 2};
        int[] test3 = {};
        int[] test4 = {7, 8, 9, 10, 7};

        System.out.println("Test 1 (No duplicates): " + sol.hasDuplicate(test1)); // false
        System.out.println("Test 2 (Has duplicates): " + sol.hasDuplicate(test2)); // true
        System.out.println("Test 3 (Empty array): " + sol.hasDuplicate(test3)); // false
        System.out.println("Test 4 (Duplicate at ends): " + sol.hasDuplicate(test4)); // true
    }
}
