import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int ans = 0;
        int answer = 0;
        int[] arr = new int[5];
        
        for (int i = 0; i<5; i++){
            arr[i] = in.nextInt();
            ans += arr[i]*arr[i];
        }
            
        answer = ans % 10;
        
        
        System.out.println(answer);
        in.close();
    }
}