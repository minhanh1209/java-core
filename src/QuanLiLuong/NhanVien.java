package QuanLiLuong;

public class NhanVien {
    private String maNV;
    private int soSP;
    private String vuotChuan;
    private int luong;

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", soSP=" + soSP +
                ", vuotChuan='" + vuotChuan + '\'' +
                ", luong=" + luong +
                '}';
    }

    public NhanVien(String maNV, int soSP, String vuotChuan, int luong) {
        this.maNV = maNV;
        this.soSP = soSP;
        this.vuotChuan = vuotChuan;
        this.luong = luong;
    }

    public NhanVien() {
        this.soSP = 0;
        this.luong = 1;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public void setVuotChuan(String vuotChuan) {
        this.vuotChuan = vuotChuan;
    }
    public String getVuotChuan() {
        return vuotChuan;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

}
