package Array;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m , n, k;
        int[][] a,b,c;
        System.out.print("nhap cap ma tran a: ");
        m = scanner.nextInt();
        n = scanner.nextInt();

        System.out.print("nhap cot ma tran b: ");
        k = scanner.nextInt();

        System.out.println("nhap ma tran a: ");
        a = nhap(m, n,scanner);
        System.out.println("nhap ma tran b: ");
        b = nhap(n,k,scanner);

        System.out.println("ma tran a:");
        xuat(a);
        System.out.println("ma tran b: ");
        xuat(b);

        System.out.println("ket qua: ");
        c = nhanMaTran(a,b);
        xuat(c);
    }
    private static int[][] nhap(int m, int n,Scanner scanner){
        int [][]x = new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        return x;
    }
    private static void xuat(int[][]x){
        for (int i = 0; i <x.length ; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.println("%5d" + x[i][j]);
            }
            System.out.println();
        }
    }
    private static int[][] nhanMaTran(int[][] a,int[][] b){
        int[][] c = new int[a.length][b[0].length];
        int m = a.length;
        int n = b[0].length;
        int k = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                for (int l = 0; l <k ; l++) {
                       c[i][j]+=a[i][l]+b[l][j];
                }
            }
        }
        return c;
    }
}
