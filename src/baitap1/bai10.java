package baitap1;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gio = 0;
        int phut = 0;
        int giay = 0;
        int ketqua = 0;

        System.out.println("nhap vao gio ");
        gio = sc.nextInt();
        System.out.println("nhap vao phut ");
        phut = sc.nextInt();
        System.out.println(" nhap vao giay ");
        giay = sc.nextInt();
        System.out.println("doi " + gio +"gio " + phut + "phut "+ giay +"giay sang giay ta duoc");
        gio = gio*3600;
        phut = phut*60;
        ketqua = gio+phut+giay;

        System.out.println("ket qua phep doi la " + ketqua + " giay");



    }
}
