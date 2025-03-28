import java.util.Scanner;

public class boj_15829 {

    private static final int r = 31;
    private static final int M = 1234567891;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        long hash = 0;
        int coef = 0;
        for (char c : str.toCharArray()) {
            long temp = c - 'a' + 1;

            for (int i = 0; i < coef; i++) {
                temp *= r;
                temp %= M;
            }
            coef++;
            hash += temp;
            hash %= M;

        }
        System.out.println(hash);

    }

}
