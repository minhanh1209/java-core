package baiTapOpp.Casino;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class test {
    public static void main(String[] args) {
        int n = 100;
        Khach[] khach = new Khach[n];
        Scanner sc = new Scanner(System.in);
        int luachon;
        do {
            System.out.println("1. Them khach thanh vien");
            System.out.println("2. Them khach vang lai");
            System.out.println("3. Hien thi toan bo danh sach ");
            System.out.println("4. Thoat chuong trinh");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    ThanhVien thanhVien = new ThanhVien();
                    thanhVien.nhap();
                    thanhVien.tinhtienthang();
                    for (int i = 0; i < khach.length ; i++){
                        if (khach[i] == null){
                            khach[i] = thanhVien;
                            break;
                        }
                    }
                    break;
                case 2:
                    VangLai vanglai = new VangLai();
                    vanglai.nhap();
                    vanglai.tinhtienthang();
                    for (int i = 0; i < khach.length ; i++) {
                        if (khach[i] == null) {
                            khach[i] = vanglai;
                            break;
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i <= khach.length; i++) {
                        if (khach[i] == null) {
                            break;
                        } else {
                            System.out.println(khach[i].toString());
                        }
                    }
                    break;
                default:
                    System.out.println("Hen gap lai");
                    break;
            }

        } while (luachon < 4);
    }
}

