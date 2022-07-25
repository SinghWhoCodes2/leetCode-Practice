package Two_Pointer;

public class TwoSumTwo {
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/discuss/2128516/Java-4-Approaches:-BF-HashMap-Binary-Search-Two-Pointers
	public static int[] twoSum_tp(int[] numbers, int target) {
        int len = numbers.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }

        return new int[]{-1, -1};
    }
}
