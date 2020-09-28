package REDBOXENTERTAINMENT.music;

public class CompactDiscMusic {
    private String tenDia;
    private int gia;
    private String ngheSi;
    private String ma;

    public CompactDiscMusic(){
    }

    @Override
    public String toString() {
        return "CDcanhac{" +
                "tenDia='" + tenDia + '\'' +
                ", gia=" + gia +
                ", ngheSi='" + ngheSi + '\'' +
                ", ma='" + ma + '\'' +
                '}';
    }

    public String getTenDia() {
        return tenDia;
    }

    public void setTenDia(String tenDia) {
        this.tenDia = tenDia;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNgheSi() {
        return ngheSi;
    }

    public void setNgheSi(String ngheSi) {
        this.ngheSi = ngheSi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }


}
