import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int b1, b2, b3;
        b1 = (int)(b * 0.01);
        b2 = (int) (b * 0.1) - (b1 * 10);
        b3 = b - (b1 * 100 + b2 * 10);

        System.out.printf("%d\n%d\n%d\n", a*b3, a*b2, a*b1);
        System.out.println(a*b);
    }
}
