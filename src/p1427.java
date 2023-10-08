import java.util.Scanner;

public class p1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int arr[] = new int[n.length()];
        for (int i = 0; i < n.length(); i++) arr[i] = n.charAt(i) - '0';
        for (int i=0; i< arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i:arr) System.out.print(i);
    }
}
