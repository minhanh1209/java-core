package baitap1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int binhphuong = 0;

        System.out.println("nhap x: ");
        x = sc.nextInt();
        binhphuong = (int) Math.pow(x,2); //Math.pow(3,5)

        System.out.println("binh phuong cua X = " + binhphuong + ".");


    }
}
