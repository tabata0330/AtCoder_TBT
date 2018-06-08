import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'W', 'X', 'Y', 'Z'};
        char[] subalpha = Arrays.copyOfRange(alpha, 0, N );
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                System.out.println("? "+subalpha[i]+" "+subalpha[j]);
                System.out.flush();
                char ans = sc.next().toCharArray()[0];
                if (ans == '>'){
                    char tmp = subalpha[i];
                    subalpha[i] = subalpha[j];
                    subalpha[j] = tmp;
                }
                Q--;
                if(!(Q > 0)){
                    break;
                }
            }
            if(!(Q > 0)){
                break;
            }
        }
        System.out.print("! ");
        System.out.flush();
        for(char c: subalpha){
            System.out.print(c);
            System.out.flush();
        }
        System.out.println();
        System.out.flush();
    }
}
