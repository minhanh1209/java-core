package QuanLiLuong;

import java.util.Scanner;

public class Tongket {
    public static void main(String[] args) {
        NhanVien nv;
        nv = nhapThongTin();
        if (nv.getSoSP() < 0){
            nv.setSoSP(0);
        }
        int soSP = nv.getSoSP();
        if (coVuotChuan(soSP) == true){
            nv.setVuotChuan("Vuot");
        }else {
            nv.setVuotChuan(" ");
        }
        int luong = nv.getLuong();
        if (soSP <= 500){
            luong = soSP * 20000;
        }else {
            luong = (soSP - 500)*30000 + 500 * 20000;
        }
        nv.setLuong(luong);
        System.out.println(nv.toString());

    }
    public static NhanVien nhapThongTin() {
        NhanVien nv = new NhanVien();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma nhan vien la :");
        nv.setMaNV(sc.nextLine());
        System.out.print("Nhap so san pham cua nhan vien :");
        nv.setSoSP(sc.nextInt());
    return nv;
    }
    public static boolean coVuotChuan(int soSP){
        if (soSP > 500){
            return true;
        }
        return false;
    }
}
