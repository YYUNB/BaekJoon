import java.io.*;

public class p2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String star = "";
            for (int j = 1; j < n-i; j++) star += " ";

            star = " ";
            star += "*";
            bw.write(star + "\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
