package day2;

public class HouseRobber1 {
    public static int houseRobber(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        if (n == 2)
            return Math.max(nums[0], nums[1]);
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            int case1 = dp[i - 1];
            int case2 = dp[i - 2] + nums[i];
            dp[i] = Math.max(case1, case2);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] nums = { 1,4,2,5,3 };
        int ans = houseRobber(nums);
        System.out.println(ans);
    }

}
