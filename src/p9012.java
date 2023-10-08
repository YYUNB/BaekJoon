import java.util.Scanner;

public class p9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            boolean check = true;
            int oCnt = 0, cCnt = 0;
            String ps = sc.next();
            for (int j = 0; j < ps.length(); j++) {
                char p = ps.charAt(j);
                if(p == '(') oCnt++;
                else if(p == ')') cCnt++;
                if(oCnt < cCnt) check = false;
            }
            if(check && (oCnt == cCnt)) System.out.println("YES");
            else if (!check || (oCnt != cCnt)) System.out.println("NO");
        }
    }
}
