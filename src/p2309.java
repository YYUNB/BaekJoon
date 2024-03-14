import java.io.*;

public class p2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];

        int heightSum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            heightSum += arr[i];
        }

        for (int i = 0; i < 8; i++) {
            int minIdx = i;
            for (int j = i+1; j < 9; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        int n1 = 0, n2 = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i != j && (heightSum - (arr[i] + arr[j]) == 100)) {
                    n1 = i;
                    n2 = j;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i != n1 && i != n2) bw.write(String.valueOf(arr[i] + " "));
        }
        bw.flush();
    }
}
