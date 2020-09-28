package baiTapOpp.Casino;

public class VangLai extends Khach{
    int phiThamGia = 2;

    public VangLai(String passport, String ten, int tienCuoc, int phiThamGia) {
        super(passport, ten, tienCuoc);
        this.phiThamGia = phiThamGia;
    }

    public VangLai(){

        super();
    }

    @Override
    public void tinhtienthang() {
        tienThang = tienCuoc - phiThamGia;

    }

    @Override
    public String toString() {
        return "VangLai{" +
                ", passport='" + passport + '\'' +
                ", ten='" + ten + '\'' +
                ", tienCuoc=" + tienCuoc +
                ", phiThamGia=" + phiThamGia +
                ", tienThang=" + tienThang +
                '}';
    }
}
