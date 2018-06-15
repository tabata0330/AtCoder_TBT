import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 0;
        int[] a = new int[N];
        while(i < N){
            a[i] = sc.nextInt();
            i++;
        }
        int[] dp = new int[N];
        dp[0] = 0;
        dp[1] = Math.abs(a[1] - a[0]);
        for (int j = 2; j < N; j++){
            dp[j] = Math.min(dp[j - 1] + Math.abs(a[j] - a[j - 1]), dp[j - 2] + Math.abs(a[j] - a[j - 2]));
        }
        System.out.println(dp[N - 1]);
    }
}
