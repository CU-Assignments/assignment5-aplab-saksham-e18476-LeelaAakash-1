...
public class SortColors {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int current = 0;

        while (current <= end) {
            if (nums[current] == 0) {
                moveToStart(nums, start, current);
                start++;
                current++;
            } else if (nums[current] == 1) {
                current++;
            } else {
                moveToEnd(nums, current, end);
                end--;
            }
        }
    }

    private void moveToStart(int[] nums, int start, int current) {
        int temp = nums[start];
        nums[start] = nums[current];
        nums[current] = temp;
    }

    private void moveToEnd(int[] nums, int current, int end) {
        int temp = nums[end];
        nums[end] = nums[current];
        nums[current] = temp;
    }

    public static void main(String[] args) {
        SortColors sorter = new SortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};
        sorter.sortColors(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
...
