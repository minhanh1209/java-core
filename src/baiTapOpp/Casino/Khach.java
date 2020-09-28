package baiTapOpp.Casino;

import java.util.Scanner;

public abstract class Khach {

    String passport;
    String ten;
    int tienCuoc, tienThang;

    public Khach(String passport, String ten, int tienCuoc) {
        this.passport = passport;
        this.ten = ten;
        this.tienCuoc = tienCuoc;
        this.tienThang = tienThang;

    }

    public Khach(){

    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap Passport: ");
        this.passport = sc.nextLine();
        System.out.print("Tien cuoc: ");
        this.tienCuoc = sc.nextInt();
    }

    public void xuat() {
    }

    public abstract void tinhtienthang();

    @Override
    public String toString() {
        return "Khach{" +
                "passport='" + passport + '\'' +
                ", ten='" + ten + '\'' +
                ", tienCuoc=" + tienCuoc +
                ", tienThang=" + tienThang +
                '}';
    }
}
