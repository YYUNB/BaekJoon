import java.io.*;
import java.util.StringTokenizer;

public class p1267 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = 0, m = 0;
        for (int i = 0; i < n; i++) {
            int time = Integer.parseInt(st.nextToken());
            y += (time/30 + 1) * 10;
            m += (time/60 + 1) * 15;
        }

        if (y>m) bw.write("M " + m);
        else if (y<m) bw.write("Y " + y);
        else bw.write("Y M " + y);

        bw.flush();
    }
}
