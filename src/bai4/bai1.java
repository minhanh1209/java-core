package bai4;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang :");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap vao so thu "+ (i+1)+ " :");
            a[i] = sc.nextInt();
        }

        System.out.println("Tong cac gia tri cua mang la : "+ tinhtong(a));
        System.out.println("Gia tri nho nhat cua mang la : "+giatriNhoNhat(a));
    }
    public static int tinhtong(int[]a){
        int s = 0;
        for (int i = 0; i < a.length; i++){
            s += a[i];
        }
        return s;
    }

       public static int giatriNhoNhat(int []a){
        int min = a[0];
        for (int i = 0; i < a.length; i++){
            if (min > a[i]){
                min = a[i];
            }
        }
        return min;
    }

}
