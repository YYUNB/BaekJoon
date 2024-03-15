import java.io.*;

public class p2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String star = "";
        for (int i = 0; i < n; i++) {
            star += "*";
            bw.write(star + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
