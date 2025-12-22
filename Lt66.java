public class Lt66 {

    public static void main(String[] args) {

        int[] digits = new int[]{3, 5, 9, 9};

        Lt66 lt66 = new Lt66();
        int[] res = lt66.plusOne(digits);
        for (int re : res) {
            System.out.print(re);
        }

    }

    /**
     * 对一个由数字组成的数组进行加一操作
     * 该数组表示一个非负整数，最高位在数组首位
     * 例如：[1,2,3] 表示数字 123，加一后变为 [1,2,4]
     *
     * @param digits 表示非负整数的数字数组，每个元素为0-9之间的数字
     * @return 加一后的数字数组
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        // 从最低位开始逐位加一处理
        for (int i = n - 1; i >= 0; i--) {
            // 当前位小于9时，直接加一并返回结果
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // 当前位为9时，置为0并继续处理更高位
            digits[i] = 0;
        }
        // 所有位都为9的情况，需要扩展数组长度
        // 创建新数组，长度加一，首位为1，其余位默认为0
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

}
