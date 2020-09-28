package baitap5;

public class HCN {
    public static void main(String[] args) {
        HCN HCN1 = new HCN();
        HCN1.chieuDai = 5;
        HCN1.chieuRong = 4;

        HCN HCN2  = new HCN(7,4);
//        System.out.println("Kich thuoc cua " + HCN1.toString());
//        System.out.println("Kich thuoc cua " +HCN2.toString());
        System.out.print("\nKich thuoc hinh chu nhat là ");
        display(HCN1.chieuDai,HCN1.chieuRong);
        System.out.print("\nDien tich cua hinh chu nhat là: ");
        tinhDT(HCN1.chieuDai, HCN1.chieuRong);
        tinhCV(HCN1.chieuDai,HCN1.chieuRong);

        System.out.print("\nKich thuoc hinh chu nhat là ");
        display(HCN2.chieuDai,HCN2.chieuRong);
        System.out.print("\nDien tich cua hinh chu nhat là: " );
        tinhDT(HCN2.chieuDai,HCN2.chieuRong);
        tinhCV(HCN2.chieuDai,HCN2.chieuRong);

    }
    public int chieuDai;
    public int chieuRong;

    public HCN(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public static void display(int chieuDai, int chieuRong){
        System.out.print("Chieu dai = " +chieuDai +", chieu rong = "+chieuRong);
    }
    public HCN(){

    }
    public static int tinhDT(int chieuDai, int chieuRong) {
        int dt = chieuDai * chieuRong;
        System.out.print(+dt);
        return dt;
    }
    public static void tinhCV(int chieuDai, int chieuRong){
        int cv = (chieuDai + chieuRong) * 2;
        System.out.println("\nChu vi hinh chu nhat là: " + cv);
        return ;
    }

    @Override
    public String  toString() {
        return "HCN{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';

    }
}
