import java.util.Scanner;

public class p1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //입력
        int N = sc.nextInt();
        int M = sc.nextInt();

        char board[][] = new char[N][M];
        for (int i = 0; i < N; i++) {
            String boardColor = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = boardColor.charAt(j);
            }
        }

        // 출력
        int min = 9999;

        int startI = 0, startJ = 0;
        int maxStartI = N-8, maxStartJ = M-8;

        char line1[] = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};
        char line2[] = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};

        while (startI <= maxStartI && startJ <= maxStartJ) {
            System.out.println("[startI:" + startI + ", startJ:" + startJ + "]");
            int changeColorCnt1 = 0;  // 맨 왼쪽 위 칸의 색을 그대로 가져가는 경우 횟수
            int changeColorCnt2 = 0;  // 맨 왼쪽 위 칸을 바꿀 때 가져가는 경우 횟수
            int currentI = 1;
            switch (board[startI][startJ]) {
                case 'B':
                    // 맨 왼쪽 위 칸이 B로 시작할 때 바꾸지 않고 그대로 가져가는 경우. 홀수행 line1 짝수행 line2
                    for (int i = startI; i < startI + 8; i++) {  // 보드판 안에서 8*8 칸 탐색
                        for (int j = startJ, lineJ = 0; j < startJ + 8 && lineJ < 8; j++, lineJ++) {
                            if ((currentI % 2 == 1) && (board[i][j] != line1[lineJ])) {
                                changeColorCnt1++;  // 홀수번째 행일 때 line1과 다르면 변경횟수++
                                System.out.println("홀수행 " + (i+1)+"행"+(j+1)+"열의 " + board[i][j] + "과 " + line1[lineJ] + "가 일치하지 않습니다.: " + changeColorCnt1);
                            }
                            else if ((currentI % 2 == 0) && (board[i][j] != line2[lineJ])) {
                                changeColorCnt1++; // 짝수번째 행일 때 line2와 다르면 변경횟수++
                                System.out.println("짝수행 " + (i+1)+"행"+(j+1)+"열의 " +board[i][j] + "과 " + line2[lineJ] + "가 일치하지 않습니다.: " + changeColorCnt1);
                            }
                        }
                        currentI++;
                    }

                    // 맨 왼쪽 위 칸이 B로 시작할 때 W로 바꾸는 경우 홀수행 line2 짝수행 line1
                    currentI = 1;
                    for (int i = startI; i < startI + 8; i++) {  // 보드판 안에서 8*8 칸 탐색
                        for (int j = startJ, lineJ = 0; j < startJ + 8 && lineJ < 8; j++, lineJ++) {
                            if ((currentI % 2 == 1) && (board[i][j] != line2[lineJ])) {
                                changeColorCnt2++;  // 홀수번째 행일 때 line2와 다르면 변경횟수++
                                System.out.println("홀수행 " + (i+1)+"행"+(j+1)+"열의 " +board[i][j] + "과 " + line2[lineJ] + "가 일치하지 않습니다.: " + changeColorCnt1);
                            }
                            else if ((currentI % 2==0) && (board[i][j] != line1[lineJ])) {
                                changeColorCnt2++; // 짝수번째 행일 때 line1과 다르면 변경횟수++
                                System.out.println("짝수행 " + (i+1)+"행"+(j+1)+"열의 " +board[i][j] + "과 " + line1[lineJ] + "가 일치하지 않습니다.: " + changeColorCnt1);
                            }
                        }
                        currentI++;
                    }

                    break;

                case 'W':
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    // 맨 왼쪽 위 칸이 W로 시작할 때 바꾸지 않고 그대로 가져가는 경우 홀수행 line2 짝수행 line1
                    for (int i = startI; i < startI + 8; i++) {  // 보드판 안에서 8*8 칸 탐색
                        for (int j = startJ, lineJ = 0; j < startJ + 8 && lineJ < 8; j++, lineJ++) {
                            if ((currentI % 2 == 1) && (board[i][j] != line2[lineJ])) {
                                changeColorCnt1++;  // 홀수번째 행일 때 line2와 다르면 변경횟수++
                                System.out.println("홀수행 " + (i+1)+"행"+(j+1)+"열의 " +board[i][j] + "과 " + line2[lineJ] + "가 일치하지 않습니다.: " + changeColorCnt1);
                            }
                            else if ((currentI % 2==0) && (board[i][j] != line1[lineJ])) {
                                changeColorCnt1++; // 짝수번째 행일 때 line1과 다르면 변경횟수++
                                System.out.println("짝수행 " + (i+1)+"행"+(j+1)+"열의 " +board[i][j] + "과 " + line1[lineJ] + "가 일치하지 않습니다.: " + changeColorCnt1);
                            }
                        }
                        currentI++;
                    }

                    // 맨 왼쪽 위 칸이 W로 시작할 때 B로 바꾸는 경우 홀수행 line1 짝수행 line2
                    currentI = 1;
                    for (int i = startI; i < startI + 8; i++) {  // 보드판 안에서 8*8 칸 탐색
                        for (int j = startJ, lineJ = 0; j < startJ + 8 && lineJ < 8; j++, lineJ++) {
                            if ((currentI % 2 == 1) && (board[i][j] != line1[lineJ])) {
                                changeColorCnt2++;  // 홀수번째 행일 때 line1과 다르면 변경횟수++
                                System.out.println("홀수행 " + (i+1)+"행"+(j+1)+"열의 " + board[i][j] + "과 " + line1[lineJ] + "가 일치하지 않습니다.: " + changeColorCnt1);
                            }
                            else if ((currentI % 2 == 0) && (board[i][j] != line2[lineJ])) {
                                changeColorCnt2++; // 짝수번째 행일 때 line2와 다르면 변경횟수++
                                System.out.println("짝수행 " + (i+1)+"행"+(j+1)+"열의 " +board[i][j] + "과 " + line2[lineJ] + "가 일치하지 않습니다.: " + changeColorCnt1);
                            }
                        }
                        currentI++;
                    }
                    break;
            }
            System.out.println("현재 최솟값: " + min + ", CCC1: " + changeColorCnt1 + ", CCC2: " + changeColorCnt2);
            if (changeColorCnt1 < min) {
                min = changeColorCnt1;  // 현재 변경 횟수가 최솟값보다 작으면 갱신
                System.out.println("ccc1으로 최솟값 갱신: " + min);
            }
            else if (changeColorCnt2 < min) {
                min = changeColorCnt2;
                System.out.println("ccc2로 최솟값 갱신 " + min);
            }

            if (startI < maxStartI) startI++;
            else if (startJ < maxStartJ){
                startI = 0;
                startJ++;
            }
            else {
                startI++;
                startJ++;
            }
        }
        System.out.println(min);
    }
}
