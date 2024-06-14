import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 몇번째 영화제목?
		int number = 0;

		while (N > 0) {
			number++;
			String s = Integer.toString(number);

			if (s.contains("666")) {
				N--;
			}
		}

		System.out.println(number);

	}

}