public class Lt724 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, -1};
        Lt724 lt724 = new Lt724();
        System.out.println(lt724.pivotIndex(nums));
    }

    /**
     * 724. 寻找数组的中心索引
     * @param nums 数组
     * @return
     */
    public int pivotIndex(int[] nums) {

        if (nums == null || nums.length == 0) return -1;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
