import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[N];
        int[] x = new int[M];
        int[] y = new int[M];
        int i = 0;
        while (i < N){
            p[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < M){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            i++;
        }
        List<HashSet> hs_list = new ArrayList<>();
        for (int j = 0; j < M; j++) {

        }
    }
}
