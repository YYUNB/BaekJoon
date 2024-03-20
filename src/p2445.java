import java.io.*;

public class p2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) bw.write("*");
            for (int j = 0; j < 2*(n-i) ; j++) bw.write(" ");
            for (int j = 0; j < i; j++) bw.write("*");
            bw.write("\n");
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = n; j > n-i ; j--) bw.write("*");
            for (int j = 0; j < 2*(n-i) ; j++) bw.write(" ");
            for (int j = n; j > n- i ; j--) bw.write("*");
            bw.write("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
