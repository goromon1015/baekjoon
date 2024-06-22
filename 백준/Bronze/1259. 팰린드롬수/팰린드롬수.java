import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {
            str = sc.nextLine();

            if (str.equals("0")) {
                break;
            }

            int N = str.length() / 2;
            int count = 0;

            for (int i = 0; i < N; i++) {
                if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                    count++;
                }
            }

            if (count == N) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        sc.close();
    }
}