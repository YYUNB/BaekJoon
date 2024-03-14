import java.util.Scanner;

public class p2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) arr[i] = sc.nextInt();

        int cnt = 0, dice = 0, max = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                if (i!=j && arr[i]==arr[j]) {
                    cnt++;
                    dice = arr[i];
                }
            }
            if (arr[i] > max) max = arr[i];
        }

        if (cnt == 3) System.out.println(10000 + (dice * 1000));
        else if (cnt == 1) System.out.println(1000 + (dice * 100));
        else System.out.println(max * 100);
    }
}
