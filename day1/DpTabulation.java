public class DpTabulation {
    static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    static int trib(int n){
        int[] dp=new int[n+1];
        if(n==0) return 0;
        if(n==1||n==2) return 1;
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int a=fib(n);
        int b=trib(n);
        System.out.println(a);
        System.out.println(b);
    }
    
}
