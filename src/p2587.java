import java.io.*;

public class p2587 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int hap = 0;
        int[] arr = new int[6];
        for (int i = 0; i < 5; i++) arr[i] = Integer.parseInt(br.readLine());

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            hap += arr[i];
        }

        bw.write(String.valueOf((int)hap/5)+"\n");
        bw.write(String.valueOf(arr[2]));
        bw.flush();
    }
}
