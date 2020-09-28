package bai4;

import java.util.Scanner;

public class baiSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so can kiem tra ");
        n = sc.nextInt();
        int i;
        int uoc = 0;
        for (i = 1; i <= n ; i++){
            if (Math.floorMod(n,i) == 0  ){
                uoc++;
            }
        }
        if (uoc == 2){
            System.out.println("So nay la so nguyen to");
        }else{
            System.out.println("So nay la khong phai la so nguyen to");
        }
    }
}
