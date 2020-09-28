package baitap2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.println("nhap vao a = ");
        a = sc.nextInt();
        b = Math.floorMod(a,2);

        if (b==0)
            System.out.println("a la so la so chan");
        else
            System.out.println("a la so le");

    }
}
