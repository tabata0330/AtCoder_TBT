import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int sum = 100 * r + g * 10 + b;
        if (sum % 4 == 0) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}