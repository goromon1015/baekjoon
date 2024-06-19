import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] board = new char[N][M];

        // 체스판 입력 받기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int minPaint = Integer.MAX_VALUE;

        // 체스판을 8x8로 잘라서 검사
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                // 첫 번째 색깔이 'W'로 시작하는 경우
                int paintCount1 = countPaintChanges(board, i, j, 'W');
                // 첫 번째 색깔이 'B'로 시작하는 경우
                int paintCount2 = countPaintChanges(board, i, j, 'B');
                // 두 경우 중 최소값 선택
                int minPaintInSegment = Math.min(paintCount1, paintCount2);
                // 전체에서의 최소값 갱신
                minPaint = Math.min(minPaint, minPaintInSegment);
            }
        }

        System.out.println(minPaint);
    }

    // 체스판을 (x, y)에서 시작하여 color로 시작하는 8x8 영역의 다시 칠해야 하는 정사각형 개수 계산
    private static int countPaintChanges(char[][] board, int x, int y, char color) {
        int count = 0;
        char expected = color;

        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                // 현재 칸의 색깔과 기대하는 색깔이 다르면 count 증가
                if (board[i][j] != expected) {
                    count++;
                }
                // 다음 칸의 기대하는 색깔을 변경
                expected = (expected == 'W') ? 'B' : 'W';
            }
            // 행이 바뀌면 기대하는 색깔도 변경
            expected = (expected == 'W') ? 'B' : 'W';
        }

        return count;
    }
}