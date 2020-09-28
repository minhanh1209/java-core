package baitap1;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.*;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int tong = 0;
        int hieu = 0;
        int tich = 0;
        float thuong = 0;

        System.out.println("nhap vao a =");
        a = sc.nextInt();
        System.out.println("nhap vao b");
        b = sc.nextInt();

        tong = a+b;
        hieu = a-b;
        tich = a*b;
        thuong = a/b;

        System.out.println("tong cua a va b la " + tong + ".");
        System.out.println("hieu cua a va b la " + hieu + ".");
        System.out.println(" tich cua a va b la " + tich + ".");
        System.out.println(" thuong cua a va b la " + thuong + ".");


    }
}
