package bai4;

import javax.swing.*;
import java.lang.management.MemoryType;
import java.util.Scanner;

public class baiSoHoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao do dai mang :");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao so thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.print("Cac phan tu cua mang la: ");
        xuatMang(a, n);
        System.out.print("\nThu tu tang dan cac phan tu trong mang la: ");
        sapXepTangDan(a, n);
        System.out.print("\nThu tu giam dan cac phan tu trong mang la: ");
        sapXepGiamDan(a, n);
        System.out.print("\nCac phan tu chan trong mang la: ");
        soChan(a, n);
        System.out.print("\nCac phan tu le trong mang la: ");
        soLe(a, n);
        System.out.print("\nCac so nguyen to trong mang la: ");
        xuatSoNguyenTo(a,n);

    }

    public static void sapXepTangDan(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        xuatMang(a, n);
        return;
    }

    public static void sapXepGiamDan(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        xuatMang(a, n);
        return;
    }

    public static void soChan(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (Math.floorMod(a[i], 2) == 0 && a[i] > 0) {
                System.out.print(+a[i] + " ");
            }
        }
        return;
    }

    public static void soLe(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (Math.floorMod(a[i], 2) != 0) {
                System.out.print(+a[i] + " ");
            }
        }
        return;
    }

    public static boolean soNguyenTo(int n) {
        if (n < 2) {
            return false;
        } else {
            int m = (int) Math.sqrt(n);
            for (int i = 2; i <= m; i++) {
               if (Math.floorMod(n,i) == 0){
                   return false;
               }
            }
            return true;
        }
    }

    public static void xuatSoNguyenTo (int []a, int n){
        for (int i = 0; i < a.length; i++){
            if (soNguyenTo(a[i]) == true){
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void xuatMang(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(+a[i] + " ");
        }
        return;
    }
}

