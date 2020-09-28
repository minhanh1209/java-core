package baitap3;

import java.util.Scanner;

public class bai7d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cr,cd;
        int i,j;

        System.out.println("Nhap vao chieu rong ");
        cr = sc.nextInt();
        System.out.println("Nhap vao chieu dai");
        cd = sc.nextInt();

        while (cr <= 0){
            System.out.println("Moi ban nhap lai chieu rong");
            cr = sc.nextInt();
        }
        while (cd <= 0 || cd < cr){// kt chieu dai be hon chieu rong hoặc  dùng đk cd > cr
            System.out.println("Mơi ban nhap lai chieu dai ");
            cd = sc.nextInt();
        }
        for (i = 1; i <= cr ; i++) {
            for (j = 1; j <= cd; j++) {
                if (i == 1 || i == cr || j == 1 || j == cd) { // cung cái de in ra thi nen de o mot if
                    System.out.print("x ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
//        for (i = 0; i < cr ; i++) {
//            if (i == 0 || (i == cr -1)){
//                for (j = 1; j < cd ; j++)
//                    System.out.print("x ");
//            }else {
//                for (j = 1; j < cd; j++) {
//                    if (j == 1 || (j == cd ))  {
//                        System.out.print("x ");
//                    } else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println("x");
//        }
    }

}
