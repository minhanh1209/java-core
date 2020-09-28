package baiTapOpp.OPP1;

import java.util.Scanner;

public class StandardStudent extends Student {
    int engMark;

    public StandardStudent(int rollNo, String name, int engMark) {
        super(rollNo, name);
        this.engMark = engMark;
    }
    public StandardStudent(){

    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Engmark");
        engMark = sc.nextInt();


    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("EngMark: " + engMark);

    }
}

