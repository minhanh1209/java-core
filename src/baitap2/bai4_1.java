package baitap2;

import java.util.Scanner;

public class bai4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang, nam;

        System.out.println("nhap vao thang");
        thang = sc.nextInt();
        System.out.println("nhap vao so nam");
        nam = sc.nextInt();
// kt nam nhuan khong nhuan
        if (Math.floorMod(nam,400) == 0 ||
                Math.floorMod(nam,4) ==0 && Math.floorMod(nam,100) != 100){
            System.out.println("nam nay la nam nhuan");
            nam = 1;
        }
        else {
            System.out.println("nam nay la nam khong nhuan");
            nam = 0;
        }
     // kt so ngay cua thang
        switch ( thang){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("thang " + thang + " co 31 ngay");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("thang " + thang + " co 30 ngay");
                break;
            default: {
                if (nam == 1  ){
                    System.out.println("so ngay cua thang " + thang +  " co 29 ngay");
                }
                else {
                    System.out.println("so ngay cua thang " + thang +  " co 28 ngay");
                }
            }

        }
    }
}
