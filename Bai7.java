package Array;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap: ");
        int n = scanner.nextInt();
        int [] a = new int [n];
        System.out.println("Nhap pt: ");
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        duongChay(a);
    }
    private static void duongChay(int []a){
        int index =0;
        int [] b = new int[a.length];
        for (int i=0;i<a.length-1;i++){
            if (a[i+1] < a[i]) {
                b[index]++;
                index++;
            }
            else {
                b[index]++;
            }
            soSanhDoDai(a,b);
        }
    }
    private static void soSanhDoDai(int [] a, int [] b){
        int max =0;
        for (int x: b) {
            if (x > max) max=x;
        }
        int v =0;
        for (int x:b){
            if(x == max){
                System.out.println("vi tri: "+v+" lan "+max);
            }
            v = v+x;
        }
    }
}
