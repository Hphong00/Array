package Array;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so pt: ");
            n = scanner.nextInt();
        } while (n < 0);
        int A[] = new int[n];
        System.out.println("Nhap phan tu: ");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Nhap: ");
        int number = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (A[i] == number) {
                count++;
            }
        }

        System.out.println(number + " " + count);
    }
}
