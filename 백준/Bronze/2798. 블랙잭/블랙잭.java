import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;    // 세수의 합
        int tmp = 0;    //근사치값
        
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();   //카드에 적힌 수
        }
        
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    sum =arr[i] + arr[j] + arr[k];
                    // 근사치tmp 보다 크고 블랙잭 이하면 새로운 근사치
                    if(tmp < sum && sum <= M)
                        tmp = sum;
                }
            }
        }
        System.out.println(tmp);
    }
}