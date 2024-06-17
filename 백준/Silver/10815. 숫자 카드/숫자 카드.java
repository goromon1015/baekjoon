import java.util.Arrays; // Arrays 클래스 가져오기
import java.util.Scanner; // Scanner 클래스 가져오기

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성하여 사용자 입력 받기

        int n = sc.nextInt(); // 첫 번째 숫자 입력받기: 숫자 카드의 개수
        int[] cards = new int[n]; // 숫자 카드를 저장할 배열 생성

        for (int i = 0; i < n; i++) {
            cards[i] = sc.nextInt(); // 숫자 카드를 배열에 추가
        }

        Arrays.sort(cards); // 이진 탐색을 위해 배열 정렬

        int m = sc.nextInt(); // 두 번째 숫자 입력받기: 판단할 숫자의 개수

        StringBuilder sb = new StringBuilder(); // 결과 출력을 위한 StringBuilder 생성

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt(); // 판단할 숫자 입력받기
            if (binarySearch(cards, num)) { // 이진 탐색으로 숫자가 배열에 있는지 확인
                sb.append("1 "); // 포함되어 있으면 "1 "을 StringBuilder에 추가
            } else {
                sb.append("0 "); // 포함되어 있지 않으면 "0 "을 StringBuilder에 추가
            }
        }

        System.out.println(sb.toString().trim()); // 결과 출력
        sc.close(); // Scanner 객체 닫기
    }

    // 이진 탐색 메서드
    private static boolean binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == key) {
                return true; // key를 찾으면 true 반환
            } else if (array[mid] < key) {
                low = mid + 1; // key가 중간값보다 크면 오른쪽 반 탐색
            } else {
                high = mid - 1; // key가 중간값보다 작으면 왼쪽 반 탐색
            }
        }

        return false; // key를 찾지 못하면 false 반환
    }
}