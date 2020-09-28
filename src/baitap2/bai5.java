package baitap2;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char kytu;

        System.out.println("nhap vao ky tu  ");
        kytu = sc.nextLine().charAt(0);

        switch (kytu){
            case 'a': case 'u': case 'e': case 'o': case 'i':
                System.out.println("day la nguyen am");
                break ;
            case 'b': case 'c': case 'd': case 'f': case 'g': case 'h':
            case 'j': case 'k': case 'l': case 'm': case 'n': case 'p':
            case 'q': case 'r': case 's': case 't': case 'v': case 'w':
            case 'x': case 'y':
                System.out.println("day la phu am");
                break;
            case 'z':
                System.out.println("day la ky tu ket thuc bang chu cai");
                break;
            default:
                System.out.println("khong phai ky tu thong thuong");
                break;
        }
    }
}
