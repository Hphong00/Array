package Array;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("So phan tu: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        sXep(a);

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
}
