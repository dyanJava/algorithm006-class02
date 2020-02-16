public class LeetCode_189_552 {
    public void rotate(int[] nums, int k) {
        // 当k大于nums长度时, 避免数组越界
        k %= nums.length;
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);

    }

    private void reverseArray(int[] nums, int begin, int end) {
        int temp = 0;
        for (int i = begin, j = end; i < j; i++, j--) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

        }
    }
}
