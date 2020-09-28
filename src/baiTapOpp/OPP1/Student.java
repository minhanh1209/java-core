package baiTapOpp.OPP1;

import java.util.Scanner;

public class Student {

    public int rollNo;
    public String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Student(){

    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Roll");
        rollNo = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap name");
        name = sc.nextLine();
    }

    public void xuat(){
        System.out.println("Xuat thong tin sinh vien Standard");
        System.out.println("rollNo :" + rollNo);
        System.out.println("Name :" + name);
    }
}
