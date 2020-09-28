package baitap5;

public class test {
    public static void main(String[] args) {
        //goi nhan vien băng cách truyền đối số tham so hoa
        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.ten = "Ngan";
        nhanVien1.diaChi ="406/9 tb";
        nhanVien1.maNV = "at140935";
        nhanVien1.tuoi = 21;
        NhanVien nhanVien2 = new NhanVien("Van", 21, "q2", "at140962");
        //dèault

        
        System.out.println(nhanVien1.toString());
        System.out.println(nhanVien2.toString());

    }
}
