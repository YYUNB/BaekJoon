import java.util.Scanner;
public class p1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt[] = new int[n+1];

        cnt[1] = 0;
        for (int i=2; i<n+1; i++) {
            cnt[i] = cnt[i-1] + 1;
            if (i%2 == 0 && cnt[i] > cnt[i/2]+1) cnt[i] = cnt[i/2] + 1;
            if (i%3 == 0 && cnt[i] > cnt[i/3]+1) cnt[i] = cnt[i/3] + 1;
        }
        System.out.println(cnt[n]);
    }
}
