package baitap1;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ngay = 0;
        int thang = 0;
        int nam = 0;

        System.out.println("nhap ngay:");
        ngay = sc.nextInt();
        System.out.println("nhap thang:");
        thang = sc.nextInt();
        System.out.println("nhap nam:");
        nam = sc.nextInt();

        System.out.println("ngay thang nam la: " + ngay + "/" + thang + "/" + nam +"");
    }
}
