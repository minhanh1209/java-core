package bai4;

import java.util.Scanner;

public class baisSoChan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai mang :");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao so thu " + (i + 1) + " :");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (Math.floorMod(a[i],2) == 0) {
                System.out.print(+a[i] +" ");
            }
        }
//        System.out.print("Thu tu tu lon den be cua mang la : ");
////        for (int i = 0; i < n; i++) {
////            System.out.print(+a[i] + " ");
////        }
    }
}