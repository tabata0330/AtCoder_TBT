import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(Math.abs(a - c) <= d){
            System.out.println("Yes");
        }else{
            if(Math.abs(b - a) <= d && Math.abs(c - b) <= d){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
