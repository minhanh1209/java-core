package baitap3;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass ;
        int temp = 1;
        String passmau ="abc123";


        System.out.println("Password cua ban la abc123");
        System.out.println("Moi ban nhap passworđ ");
        pass = sc.nextLine();

             if (!passmau.equalsIgnoreCase(pass)) {
                 while (temp < 3) {
                     System.out.println("Moi ban nhap lai password");
                     pass = sc.nextLine();
                     temp++;
                 }
                 System.out.println("Xin loi ban, chung toi phai khoa tai khoan nay");
            }else {
                 System.out.println(" Ban da Login thanh cong");
             }


    }
}
