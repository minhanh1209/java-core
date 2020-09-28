package Collection.Mobiles;

import Collection.Mobiles.Mobile;

import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileTest {
    static HashSet<Mobile> list = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            menu();
            luaChon = sc.nextInt();

            switch (luaChon) {
                case 1:
                    list.add(addMobile());
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    displayAll();
                    break;
                default:
                    System.out.println("Cám ơn và hẹn gặp lại");
                    break;
            }
        } while (luaChon < 4);
    }


    public static void menu() {
        System.out.println("-------------menu--------------");
        System.out.println("1. Thêm mới một số điện thoại");
        System.out.println("2. Tìm và xóa số điện thoại");
        System.out.println("3. Hiển thị toàn bộ danh sách điện thoại");
        System.out.println("4. Thoát chương trình");
        System.out.println("Mời bạn chọn giao dịch");
    }

    public static Mobile addMobile() {
        Scanner sc = new Scanner(System.in);
        Mobile mobile = new Mobile();
        System.out.print("Nhập vào ID ");
        mobile.moblieID = sc.nextLine();
        String PATTEN_ID = "[SS-SM-NK-MT]{2}[0-9]{4}$";
        Pattern checkID = Pattern.compile(PATTEN_ID);
        while (!checkID.matcher(mobile.moblieID).matches()) {
            System.out.print("ID không hợp lệ mời bạn nhập ID mới ");
            mobile.moblieID = sc.nextLine();
        }
        for (Mobile result : list) {
            if (result.moblieID.equals(mobile.moblieID)) {
                System.out.println("ID đã tồn tại, mời bạn nhập lại ID");
                mobile.moblieID = sc.nextLine();
            } else {
                System.out.println("Tạo ID thành công");
            }
        }
        mobile.moblieModel = mobile.moblieID.substring(0, 2);
        System.out.println("Model của sản phẩm là " + mobile.moblieModel);

        System.out.print("Nhập vào màu ");
        mobile.mobileColor = sc.nextLine();
        String PATTERN_COLOR = "[1-5]{1}$";
        Pattern checkColor = Pattern.compile(PATTERN_COLOR);
        while (!checkColor.matcher(mobile.mobileColor).matches()) {
            System.out.print("Nhập màu sai mời bạn nhập lại: ");
            mobile.mobileColor = sc.nextLine();
        }
        System.out.println("Nhập màu thành công");

        System.out.print("Nhập vào giá sản phẩm ");
        mobile.gia = sc.nextInt();
        while (mobile.gia < 0 || mobile.gia >= 2000) {
            System.out.print("Không hợp lệ , mời bạn nhập lại: ");
            mobile.gia = sc.nextInt();
        }
        System.out.println("Nhập giá thành công");
        return mobile;
    }

    public static void displayAll() {
        if (list.size() == 0) {
            System.out.println("Không có số điện thoại nào trong danh sách");
        }else {
            for (Mobile result : list) {
                System.out.println(result);
            }
        }
    }

    public static void delete() {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập vào ID ");
        String moblieID = sc.nextLine();
        for (Mobile result : list) {
            if (result.moblieID.equals(moblieID)) {
                System.out.println("Tìm thấy điện thoại , bạn có chắc chắn muốn xóa");
                System.out.print("Xóa chọn 1, hủy xóa chọn 0 ");
                int xoa = sc.nextInt();
                if (xoa == 1){
                    list.remove(result);
                    System.out.println("Xoa thanh cong");
                    flag ++;
                    break;
                }else {
                    flag += 0;
                    System.out.println("Hủy xóa thành công ");
                }
            }
        }
        if (flag == 0){
            System.out.println("Không tìm thấy sản phẩm");
        }
    }
}

