import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for(String j: String.valueOf(i).split("")){
                sum += Integer.parseInt(j);
            }
            if(sum >= A && sum <= B){
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
