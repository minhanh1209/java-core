package baiTapOpp.OPP1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        StandardStudent standardStudent = new StandardStudent();
        PremiumStudent premiumStudent = new PremiumStudent();
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("-----------------menu------------------");
            System.out.println("1. Nhap thong tin sinh vien Standard");
            System.out.println("2. Xuat thong tin sinh vien Standard");
            System.out.println("3. Nhap thong tin sinh vien Premium");
            System.out.println("4. Xuat thong tin sinh vien Premium");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    standardStudent.nhap();
                    break;
                case 2:
                    standardStudent.xuat();
                    break;
                case 3:
                    premiumStudent.nhap();
                    break;
                case 4:
                    premiumStudent.xuat();
                    break;

                default: break;
            }
        }
            while (chon < 4);

    }
}

