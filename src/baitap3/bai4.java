package baitap3;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int P,i = 1;

        System.out.println("Nhap so n");
        n = sc.nextInt();

        for (i = 1; i <= 10 ; i++){
            P = n * i;
            System.out.println(+ n + " x " + i +" = " + P + "");
        }
    }
}
