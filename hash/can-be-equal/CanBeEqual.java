import java.util.HashMap;
import java.util.Map;

class CanBeEqual {
    /*
     * O(n) time complexity and O(n) space complexity because we loop only once the
     * array and we store the numbers in a map - which will have a good performance
     * considering we're using a good hash function.
     */
    public boolean canBeEqual(int[] target, int[] arr) {
        // Edge cases
        if (target.length != arr.length) { // O(1)
            return false;
        }

        if (target.length == 0 || arr.length == 0) { // O(1)
            return true;
        }

        // Create a hash map to count occurrences of each number in the target array
        Map<Integer, Integer> targetMap = new HashMap<>();
        for (int num : target) { // O(n)
            targetMap.put(num, targetMap.getOrDefault(num, 0) + 1); // O(1)
        }

        // Iterate through the arr array
        for (int num : arr) { // O(n)
            if (!targetMap.containsKey(num)) { // O(1)
                // If the number is not in targetMap, return false
                return false;
            }
            // Decrement the count of the number in the map
            targetMap.put(num, targetMap.get(num) - 1); // O(1)
            if (targetMap.get(num) == 0) {
                // If the count becomes zero, remove the number from the map
                targetMap.remove(num); // O(1)
            }
        }

        // Check if the map is empty, meaning all counts matched
        return targetMap.isEmpty(); // O(1)
    }

    public static void main(String[] args) {
        CanBeEqual s = new CanBeEqual();
        int[] target = { 1, 2, 7, 4 };
        int[] arr = { 2, 4, 1, 3 };
        boolean r = s.canBeEqual(target, arr);
        System.out.println(r);
    }
}