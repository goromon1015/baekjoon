import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int[] arr = new int[N];
        int tmp = 0;
        
        for (int i=0; i<N; i++){
            arr[i] = in.nextInt();
        }
        
        for (int i=0; i<N-1; i++){
            for (int j=i+1; j<N; j++){
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}