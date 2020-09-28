package DanhSachSv;

import DanhSachSv.SinhVien;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class danhSachSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so sinh vien can nhap thong tin: ");
        n = sc.nextInt();
        xuatSinhVien(nhap(n));


    }

    public static SinhVien[] nhap(int n) {
        int ID, diemToan, diemVan, diemAnh;
        String hoTen;
        SinhVien[] arraySV = new SinhVien[n];// SinhVien[] truyen dc tat ca gia tri cua doi tuong

        for (int i = 0; i < arraySV.length; i++) {
            SinhVien sv = new SinhVien();
            Scanner sc = new Scanner(System.in);// tao mot sinh vien moi
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("ID: ");
            sv.ID = Integer.parseInt(sc.nextLine());
            System.out.print("Ho  va ten: ");
            sv.hoTen = sc.nextLine();
            System.out.print("Diem toan: ");
            sv.diemToan = sc.nextInt();
            System.out.print("Diem van: ");
            sv.diemVan = sc.nextInt();
            System.out.print("Diem anh: ");
            sv.diemAnh = sc.nextInt();
            sv.dtb = diemTB(sv);
            arraySV[i] = sv;//di chung  Scanner sc = new Scanner(System.in); neu bo arraySv[i].diem

        }
        return arraySV;
    }

    //int[],String[],SinhVien[]
    public static void xuatSinhVien(SinhVien[] array ) {
        for (int i = 0; i < array.length; i++) { ;
            System.out.println(array[i].toString());
        }
    }
    public static float diemTB(SinhVien sv ){// chuyen nghiep do

        return  (sv.diemAnh + sv.diemVan + sv.diemToan)/3;
    }

}


