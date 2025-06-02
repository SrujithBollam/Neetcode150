import java.util.HashSet;
import java.util.Set;

public class DuplicateChecker {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> table = new HashSet<>();

        for (int num : nums) {
            if (table.contains(num)) {
                return true;
            }
            table.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        DuplicateChecker checker = new DuplicateChecker();

        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {1, 2, 3, 1};
        int[] test3 = {};
        int[] test4 = {10, 20, 30, 40, 50, 10};

        System.out.println("Test 1 (No duplicates): " + checker.containsDuplicate(test1)); // false
        System.out.println("Test 2 (Has duplicates): " + checker.containsDuplicate(test2)); // true
        System.out.println("Test 3 (Empty array): " + checker.containsDuplicate(test3)); // false
        System.out.println("Test 4 (Duplicate at ends): " + checker.containsDuplicate(test4)); // true
    }
}
