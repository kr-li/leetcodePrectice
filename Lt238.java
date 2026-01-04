/**
 * 238. 除自身以外数组的乘积
 * [1,2,3,4]
 *
 * [1,2,6,24]
 * [24,24,12,4]
 *
 * [24,12,8,6]
 *
 */
public class Lt238 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        Lt238 lt238 = new Lt238();
        int[] res = lt238.productExceptSelf(nums);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }


    public int[] productExceptSelf(int[] nums) {
        int temp = 1;

        int [] multiply = new int[nums.length];
        int [] multiply2 = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            temp *= cur;
            multiply[i] = temp;
        }

        int temp2 = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int cur = nums[i];
            temp2 *= cur;
            multiply2[i] = temp2;
        }
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = multiply2[i + 1];
                continue;
            }
            if (i == nums.length - 1) {
                res[i] = multiply[i - 1];
                continue;
            }
            res[i] = multiply[i - 1] * multiply2[i + 1];
        }
        return res;
    }
}
