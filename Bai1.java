package Array;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("So phan tu: ");
        int n = scanner.nextInt();
        int[] a = new int [n];
        for (int i = 0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        int k=1;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                k = 0;
                break;
            }
        }
        if (k == 0) {
            System.out.println("K đối xứng");
        } else {
            System.out.println("đối xứng");
        }
    }
}
