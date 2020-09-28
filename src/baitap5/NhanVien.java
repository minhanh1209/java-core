package baitap5;

public class NhanVien {
    public String ten;
    public int tuoi;
    public String diaChi;
    public String maNV;

    public NhanVien(String ten, int tuoi, String diaChi, String maNV) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.maNV = maNV;
    }
    public NhanVien(){
        // de tương tac vs nguoi dung
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diaChi='" + diaChi + '\'' +
                ", maNV='" + maNV + '\'' +
                '}';
    }
    
}
