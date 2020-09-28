package DanhSachSv;

public class SinhVien {
    int ID;
    String hoTen;
    int diemToan;
    int diemVan;
    int diemAnh;
    float dtb;

    @Override
    public String toString() {
        return "SinhVien{" +
                "ID=" + ID +
                ", hoTen='" + hoTen + '\'' +
                ", diemToan=" + diemToan +
                ", diemVan=" + diemVan +
                ", diemAnh=" + diemAnh +
                ", dtb=" + dtb +
                '}';
    }

    public SinhVien(int ID, String hoTen, int diemToan, int diemVan, int diemAnh, float dtb) {
        this.ID = ID;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemAnh = diemAnh;
        this.dtb = dtb;
    }
    public SinhVien(){

    }



}
