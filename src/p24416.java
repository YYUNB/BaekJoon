import java.util.Scanner;

public class p24416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cntOne[] = new int[41];
        cntOne[0] = 0;
        cntOne[1] = 1;

        int cnt = -1;
        for (int i=2; i < n+1; i++) {
            cntOne[i] = cntOne[i-1] + cntOne[i-2];
            cnt++;
        }
        System.out.print(cntOne[n] + " " + cnt);
    }
}
