package Array;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.print("So phan tu: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("phan tu: ");
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        sXep(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("Nhap x: ");
        int x = scanner.nextInt();

        a = insert(a,x);
        System.out.println("chen vao: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    private static void sXep(int [] arr){
        int ar = 0;
        for(int i= 0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    ar = arr[j];
                    arr[j] = arr[i];
                    arr[i] = ar;
                }
            }
        }
    }

    public static int [] insert(int [] arr, int k) {
        int arrA = arr.length - 1;
        int b = arr.length;
        int [] trr = new int [b + 1];
        boolean inserted = false;

        for (int i = b; i >= 0; i--) {
            if (arrA > -1 && arr[arrA] > k) {
                trr[i] = arr[arrA--];
            } else {
                if (!inserted) {
                    trr[i] = k;
                    inserted = true;
                } else {
                    trr[i] = arr[arrA--];
                }
            }
        }
        return trr;
    }
}
