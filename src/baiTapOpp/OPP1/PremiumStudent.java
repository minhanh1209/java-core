package baiTapOpp.OPP1;

import java.util.Scanner;

public class PremiumStudent extends StandardStudent{
    int mathMark;

    public PremiumStudent(int rollNo, String name, int engMark, int mathMark) {
        super(rollNo, name, engMark);
        this.mathMark = mathMark;
    }
    public PremiumStudent(){

    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap MathMark");
        mathMark = sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("MathMark" + mathMark);
    }
}
