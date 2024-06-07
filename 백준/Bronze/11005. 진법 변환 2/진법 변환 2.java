import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        // 결과를 담을 배열, N의 최대 길이는 log_B(N)
        char[] result = new char[32];
        int index = 0;
        
        // B진수 변환
        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                result[index++] = (char) (remainder + '0');
            } else {
                result[index++] = (char) (remainder - 10 + 'A');
            }
            N /= B;
        }
        
        // 결과를 역순으로 출력
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(result[i]);
        }
        
        sc.close();
    }
}