package baitap2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang, nam;



        System.out.println("nhap vao thang");
        thang = sc.nextInt();
        System.out.println("nhap vao so nam");
        nam = sc.nextInt();

        if (Math.floorMod(nam,400) == 0 ){
            System.out.println("nam nay la nam nhuan");
        }
        else if(Math.floorMod(nam,4) ==0 && Math.floorMod(nam,100) != 100) {
            System.out.println("nam nay la nam nhuan");
            nam=1;
        }
        else {
            System.out.println("nam nay la nam khong nhuan");
            nam=0;
        }

        if (thang == 2){
            if (nam == 1  ){
                System.out.println("so ngay cua thang " + thang +  "co 29 ngay");
            }
            else {
                System.out.println("so ngay cua thang " + thang +  " co 28 ngay");
            }
        }
        else {
            if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
                System.out.println("so ngay cua thang " + thang + " la 30 ngay");
            } else {
                System.out.println("so ngay cua thang " + thang + " la 31 ngay");
            }
        }
    }
}

