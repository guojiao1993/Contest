package meituan.Y2017.A.T1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int[] cs = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int n = l; n <= r; n++) {
                for (int i = 1; i <= 9; i++) {
                    System.out.println(cs[i]);
                }
            }
        }
    }
}
