package Array;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Bai4 {
    public static void main(String[] args) {
        nhapsulieu();
    }
    private static Scanner scanner = new Scanner(System.in);
    private static void nhapsulieu(){
        System.out.print("Nhap so pt: ");
        int n = scanner.nextInt();
        int [] a = new int[n];
        System.out.println("Nhap pt: ");
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        System.out.println("Nhap x: ");
        int x = scanner.nextInt();

        int k= 999;
        for (int i=0 ;i<n;i++){
            if(abs(x-a[i])<k){
                k = abs(x-a[i]);
            }
        }
        for(int j = 0; j < n; j++)
        {
            if(soNguyenTo(a[j]) && (abs(x - a[j]) == k) )
                System.out.println(j);
        }

    }
    private static boolean soNguyenTo(int n){
        if(n<2){
            return false;
        }
        int squareRoot = (int)Math.sqrt(n);
        for (int i=2;i<= squareRoot;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
