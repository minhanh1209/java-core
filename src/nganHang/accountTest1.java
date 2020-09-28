package nganHang;

import java.util.Scanner;

public class accountTest1 {
        public static void main(String[] args) {
            Account MinhAnh = new Account();
            Scanner sc = new Scanner(System.in);
            int nhap = 1;
            String maPin;
            System.out.print("Moi ban nhap ma pin: ");
            maPin = sc.nextLine();

            while (nhap <= 3) {
                if (check(maPin) == true) {
                    menu();
                    int lc = sc.nextInt();
                    switch (lc) {
                        case 1:
                            System.out.print("Moi ban nhap so tien gui ");
                            int gui = sc.nextInt();
                            if (kiemTraGui(gui) == true) {
                                System.out.println("So tien ban gui vao tai khoan la " + gui);
                                MinhAnh.gui(gui);
                            } else {
                                System.out.println("Ban da nhap sai cu phap moi ban chon giao dich moi ");
                                break;
                            }
                            System.out.println("So du hien trong tai khoan la " + MinhAnh.getBalance());
                            break;

                        case 2:
                            System.out.print("Moi ban nhap so tien rut ");
                            int rut = sc.nextInt();
                            if (kiemTraRut(rut, MinhAnh.balance) == true) {
                                System.out.println("So tien ban muon rut la " + rut);
                                MinhAnh.rut(rut);
                            } else {
                                System.out.println("So du trong tai khoan cua ban khong du de thuc hien giao dich ");
                                break;
                            }
                            System.out.println("So du hien tai trong tai khoan la " + MinhAnh.getBalance());
                            break;
                        case 3:
                            System.out.println("So du hien tai trong tai khoan la " + MinhAnh.getBalance());
                            break;
                        case 4:
                            System.out.println("!!! Cam on quy khach da thuc hien giao dich !!!");
                            break;
                        default:
                            System.out.println("Ban da nhap sai cu phap moi ban chon chuc nang muon giao dich !!!");
                            break;
                    }
                    if (lc == 4){
                        break;
                    }
                } else {
                    if (nhap == 3) {
                        System.out.println("Ban da nhap sai " + nhap + " lan.Tai khoan cua ban da bi khoa");
                        break;
                    }
                    System.out.println("Ban da nhap sai " + (nhap) + ",Ban con" + " " + (3 - nhap) + " lan nhap.");
                    System.out.print("Moi ban nhap lai ma pin:");
                    maPin = sc.nextLine();
                    nhap++;
                }
            }
        }

    public static boolean check(String maPin) {
        Account myAccount = new Account();
        if (maPin.equalsIgnoreCase(myAccount.maPin)) {
            return true;
        }
        return false;
    }

    public static void menu() {
        System.out.println("------------menu-----------");
        System.out.println("1. Gui tien vao tai khoan");
        System.out.println("2. Rut tien tu tai khoan ");
        System.out.println("3. Truy van so du tai khoan");
        System.out.println("4. Exit");
        System.out.print("Moi ban nhap chuc nang: ");
    }
    public static boolean kiemTraGui (int gui){
        if (gui > 0){
            return true;
        }
        return false;
    }

    public static boolean kiemTraRut (int rut, int sodu){
            if (rut < sodu ){
                return true;
            }
            return false;
    }
}