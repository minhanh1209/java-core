package baitap1;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int giay = 0;
        int phut = 0;
        int gio =0;
        float ketqua = 0;

        System.out.println(" nhap vao giay lam viec ");
        giay = sc.nextInt();

        gio = giay/3600;
        //giay = giay-gio*3600;
//        phut = giay/60;
//        giay = giay -phut*60;

        phut = Math.floorMod(giay,3600)/60;
        giay = Math.floorMod((Math.floorMod(giay,3600)),60);

        System.out.println("kq " +gio+ "gio " +phut+ "phut " +giay+ "giay");


    }
}
