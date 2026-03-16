package day3;

public class CountSubsets {
    static int countSubsets(int[] nums, int target) {
        int n = nums.length;
        int[][] dp = new int[n + 1][target + 1];
        for (int i = 0; i <= n; i++)
            dp[i][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (nums[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j - nums[i - 1]] + dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5};
        int target = 10;
        int ans = countSubsets(nums, target);
        System.out.println(ans);
    }
}
