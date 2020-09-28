package baitap1;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float chieudai = 0;
        float chieurong = 0;
        float chuvi = 0;
        float dientich = 0;

        System.out.println(" nhap vao chieu dai cua hinh chu nhat = ");
        chieudai = sc.nextFloat();
        System.out.println("nhap vao chieu rong cua hinh chu nhat =");

        chieurong = sc.nextFloat();
        chuvi = chieudai+chieurong;
        dientich= chieudai*chieurong;

        System.out.println("chu vi hinh chu nhat la " + chuvi + ".");
        System.out.println("dien tich hinh chu nhat la " + dientich + ".");

    }
}
