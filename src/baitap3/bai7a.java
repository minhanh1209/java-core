package baitap3;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class bai7a {
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
        while (cd <= 0){
            System.out.println("Mơi ban nhap lai chieu dai ");
            cd = sc.nextInt();
        }

        for(i = 1 ; i < cd; i++){
            for(j = 1; j < cd; j++){
                System.out.print("x");
            }
            System.out.println("x");
        }

    }
}
