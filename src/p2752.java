import java.util.Scanner;

public class p2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];

        for (int i = 0; i < 3; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            int minIdx = i;
            for (int j = i+1; j < 3; j++) if(arr[j] < arr[minIdx]) minIdx = j;

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        for (int i = 0; i < 3 ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
