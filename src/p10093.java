import java.io.*;
import java.util.StringTokenizer;

public class p10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }

        if (a==b) bw.write(String.valueOf(0));
        else bw.write(String.valueOf(b-a-1 + "\n"));

        for (long i = a+1; i < b ; i++) {
            bw.write(String.valueOf(i + " "));
        }
        bw.flush();
    }
}
