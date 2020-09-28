package baitap1;

import java.util.Scanner;

public class bai2 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int masoSV = 0;
         int namsinh = 0;
         float diemtrungbinh = 0;
         System.out.println("nhap thong tin sinh vien");
         System.out.println("nhap ma so sinh vien: ");
         masoSV = sc.nextInt();
         System.out.println("nhap nam sinh:");
         namsinh = sc.nextInt();
         System.out.println("nhap diem trung binh");
         diemtrungbinh = sc.nextFloat();

         System.out.println("ma so sinh vien cua ban la: " + masoSV + ".");
         System.out.println("nam sinh cua ban la: " +namsinh + ".");
         System.out.println("diem trung binh cua ban la: " + diemtrungbinh + ".");
    }


}
