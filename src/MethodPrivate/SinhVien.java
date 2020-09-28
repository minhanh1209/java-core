package MethodPrivate;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private float diemLt;
    private float diemTh;
    private float diemtb;

    public SinhVien(String maSV, String hoTen, float diemLt, float diemTh, float diemtb) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLt = diemLt;
        this.diemTh = diemTh;
        this.diemtb = diemtb;

    }

    public SinhVien() {
        this.diemtb = 0;
        this.diemLt = 0;
        this.diemTh = 0;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", hoTen='" + hoTen + '\'' +
                ", diemLt=" + diemLt +
                ", diemTh=" + diemTh +
                '}';
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLt() {
        return diemLt;
    }

    public void setDiemLt(float diemLt) {
        this.diemLt = diemLt;
    }

    public float getDiemTh() {
        return diemTh;
    }

    public void setDiemTh(float diemTh) {
        this.diemTh = diemTh;
    }

    public float tinhDiem(float lt,float th){
         return  (float)(lt+th)/2;
    }

}

//    private int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
