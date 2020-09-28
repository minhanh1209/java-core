package baitap3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        int S = 1;

        System.out.println("Nhap vao n la so nguyen duong ");
        n = sc.nextInt();
        if (n<1){
            System.out.println("Nhap lai n");
            n = sc.nextInt();
        }else {
            {
                for (i = 1; i <= n; i++) {
                    S *= i;
                }
            }
            System.out.println(" Giai thua cua n là " + S + ".");
        }

    }
}
