import java.util.HashMap;
import java.util.Map;

// O(n) time complexity and O(n) space complexity because we loop only once the
// array and we store the numbers and their indices in a map - which will have
// a good performance considering we're using a good hash function.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create map to store the number and its index
        Map<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            // Check if the complement (diff) exists in the map
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }

            // Add the number and its index to the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[] {};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = { 3, 3 };
        int target = 6;
        int[] result = s.twoSum(nums, target);

        // Print the result
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
