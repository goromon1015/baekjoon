import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 종료 조건 검사
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // 각 변의 길이를 제곱하여 계산
            int a2 = a * a;
            int b2 = b * b;
            int c2 = c * c;

            if (a2 + b2 == c2 || b2 + c2 == a2 || a2 + c2 == b2) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

        sc.close();
    }

}