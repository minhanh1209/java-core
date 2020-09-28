package MethodPrivate;

import java.util.Scanner;

public class Quanli {
    public static void main(String[] args) {
        SinhVien sv;
        System.out.println("Nhap thong tin sinh vien ");
         sv = nhapThongTin(); ///// Hứng giá trị dùm tui
        System.out.println("Ket qua hoc tap: ");
        float th = sv.getDiemTh();
        float lt = sv.getDiemLt();
        float diemtb = sv.tinhDiem(th,lt);
        if (ketQua(diemtb) == true){
            System.out.println("Dau");
        }else {
            System.out.println("Rot");
        }
    }

public static SinhVien nhapThongTin(){
    Scanner sc = new Scanner(System.in);
    SinhVien sv = new SinhVien();
    System.out.print("Nhap ma so sinh vien: ");
    sv.setMaSV(sc.nextLine());
    System.out.print("Nhap ho ten: ");
    sv.setHoTen(sc.nextLine());
    System.out.print("Nhap diem li thuyet: ");
    sv.setDiemLt(sc.nextFloat());
    System.out.print("Nhap diem thuc hanh: ");
    sv.setDiemTh(sc.nextFloat());
    return sv;
}

    public  static boolean ketQua(float diemtb){
        if(diemtb >= 5){
            return true;
        }
        return false;
    }

}
