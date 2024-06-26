import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int c = sc.nextInt();
		
		String A = Integer.toString(a);
		String B = ""+b;
		String k = A+B;
		int t = Integer.parseInt(k);
		
		System.out.println(a+b-c);
		System.out.println(t-c);
	}

}
