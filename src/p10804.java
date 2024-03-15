import java.io.*;
import java.util.StringTokenizer;

public class p10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] card = new int[21];
        for (int i = 1; i <= 20; i++) card[i] = i;

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int temp = 0;
            for (int j = 0; j < (end-start+1)/2 ; j++) {
                temp = card[start + j];
                card[start + j] = card[end - j];
                card[end - j] = temp;
            }
        }

        for (int i = 1; i < 21; i++) bw.write(card[i] + " ");

        br.close();
        bw.close();
    }
}