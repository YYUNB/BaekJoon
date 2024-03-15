import java.io.*;
import java.util.StringTokenizer;

public class p10804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] card = new int[21];
        for (int i = 0; i < 20; i++) card[i] = i + 1;

        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken())-1;

            System.out.println((start+1) + "~" + (end+1) + ": ");

            for (int j = 0; j < end-start+1; j++) {
                int temp = card[start+j];
                card[start+j] = card[end];

                card[start+j + 1] = card[temp];

            }

            for (int j = 0; j < 20; j++) System.out.print(card[j] + " ");
        }

        for (int i = 0; i < 20; i++) {
            bw.write(card[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
