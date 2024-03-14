import java.util.Scanner;

public class p2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hap = 0, min = 100;
        for (int i = 0; i < 7; i++) {
            int n = sc.nextInt();
            if (n % 2 == 1) {
                hap += n;
                if(min > n) min = n;
            }
        }
        if (hap == 0) System.out.println(-1);
        else System.out.println(hap + "\n" + min);
    }
}
