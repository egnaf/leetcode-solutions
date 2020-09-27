package solutions.problem1470;

//     1, 2, 3, 4
//       5, 6, 7, 8
class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int f = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                result[i] = nums[n + f - 1];
            } else {
                result[i] = nums[f];
                f++;
            }
        }
        return result;
    }
}
