import java.util.Scanner;

public class p2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] yut = new int[3][4];

        for (int i = 0; i < 3; i++) {
            int cnt0 = 0;
            for (int j = 0; j < 4; j++) {
                yut[i][j] = sc.nextInt();
                if(yut[i][j] == 0) cnt0++;
            }
            if (cnt0 == 0) System.out.println("E");
            else if (cnt0 == 1) System.out.println("A");
            else if (cnt0 == 2) System.out.println("B");
            else if (cnt0 == 3) System.out.println("C");
            else if (cnt0 == 4) System.out.println("D");
        }

    }
}
