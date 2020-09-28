package REDBOXENTERTAINMENT.movie;

public class CompactDiscMovie {
    private String tenDia;
    private int gia;
    private String ma;

    public CompactDiscMovie(String tenDia, int gia, String ma) {
        this.tenDia = tenDia;
        this.gia = gia;
        this.ma = ma;
    }
    public CompactDiscMovie(){
    }

    @Override
    public String toString() {
        return "CDphim{" +
                "tenDia='" + tenDia + '\'' +
                ", gia=" + gia +
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

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
}
