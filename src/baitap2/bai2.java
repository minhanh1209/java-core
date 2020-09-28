package baitap2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int luongcoban = 650000;
        int TNCT ;
        float heso;
        float luong;

        System.out.println(" nhap vao tham nien cong tac cua nhan vien ");
        TNCT = sc.nextInt();

        if (TNCT < 12){
            heso = (float) 1.92;
        }
        else if (TNCT < 36){
            heso = (float) 2.34;
        }
        else if (TNCT < 60){
            heso = (float) 3;
        }
        else {
            heso = (float) 4.5;
        }
        luong = (float) heso*luongcoban;
        System.out.println("Luong nhan duoc la " + luong + ".");
    }
}
