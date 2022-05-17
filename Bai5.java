package Array;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.awt.geom.AreaOp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) throws  Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so pt Ma: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Nhap so pt Mb: ");
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int j = 0; j < m; j++) {
            b[j] = scanner.nextInt();
        }

        System.out.println("vi tri p: ");
        int p = scanner.nextInt();

        a = new int[m+n];

        insert(a,n,b,n,p);
        for (int i= 0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
    private static void insert(int[] a, int n,int []b, int m,int p){
        if(p<=0){
            for (int i = n-1 ; i>= m ;i--){
                a[i] =a[i-m];
            }
            for (int i = 0; i<m; i++){
                a[i]=b[i];
            }
        }
        else {
            for (int i=n-1; i>=m+p;i--){
                a[i] = a[i-m];
            }
            for (int i=p;i<p+m;i++){
                a[i]=b[i-p];
            }
        }
    }
}
