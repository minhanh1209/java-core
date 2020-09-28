package baiTapOpp.Casino;

public class ThanhVien extends Khach{
    int thuong = 2;

    public ThanhVien(String passport, String ten, int tienCuoc, int thuong) {
        super(passport, ten, tienCuoc);
        this.thuong = thuong;
    }
    public ThanhVien (){

    }

    @Override
    public void nhap() {
        super.nhap();
    }

    @Override
    public void tinhtienthang() {
         tienThang = thuong * tienCuoc;
    }

    @Override
    public String toString() {
        return "ThanhVien{" +
                ", passport='" + passport + '\'' +
                ", ten='" + ten + '\'' +
                ", tienCuoc=" + tienCuoc +
                ", thuong=" + thuong +
                ", tienThang=" + tienThang +
                '}';
    }
}
