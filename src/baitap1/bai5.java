package baitap1;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;

        System.out.println("nhap X = ");
        x = sc.nextInt();
        x = (int) (3*Math.pow(x,3)-5*Math.pow(x,2)+6);

        System.out.println("ket qua phep tinh la " + x + ".");
    }
}
