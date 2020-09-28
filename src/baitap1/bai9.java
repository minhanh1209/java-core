package baitap1;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final float pi= (float) 3.14;
        float bankinh = 0;
        float chuvi = 0;
        float dientich = 0;

        System.out.println("nhap vao ban kinh duong tron = ");
        bankinh = sc.nextFloat();

        chuvi = bankinh*2*pi;
        dientich = (float) Math.pow(bankinh,2)*pi;

        System.out.println("chu vi duong tron la = " + chuvi + ".");
        System.out.println("dien tich duong tron la " + dientich + ".");

    }
}
