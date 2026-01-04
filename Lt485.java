public class Lt485 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 0, 1, 1, 1};
        Lt485 lt485 = new Lt485();
        System.out.println(lt485.findMaxConsecutiveOnes(nums));
    }

    /**
     * 485. 最大连续1的个数, 给定一个二进制数组， 计算其中最大连续1的个数
     * @param nums 二进制数组
     * @return 最大连续1的个数
     */
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0;

        if (nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                int count = 0;
                while (i < nums.length && nums[i] == 1) {
                    count++;
                    i++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}
