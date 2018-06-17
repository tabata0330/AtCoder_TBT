import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int i = 0;
        while(i < N){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            i++;
        }
        int[][][] dp = new int[N + 1][W + 1][K + 1];

        for (int l = 0; l <= W; l++) {
            for (int j = 0; j <= K; j++) {
                dp[0][l][j] = 0;
            }
        }
        for (int j = 1; j <= N; j++) {
            for (int k = 1; k <= W; k++) {
                for (int l = 1; l <= K; l++) {
                    if(k >= a[j - 1]){
                        dp[j][k][l] = Math.max(dp[j - 1][k - a[j - 1]][l - 1] + b[j - 1], dp[j - 1][k][l]);
                    }else{
                        dp[j][k][l] = dp[j - 1][k][l];
                    }
                }

            }
        }
        System.out.println(dp[N][W][K]);
    }
}
