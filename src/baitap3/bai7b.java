package baitap3;

import java.util.Scanner;

public class bai7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chieuC;
        int i,j;

        System.out.println("Nhap vao chieu cao cua tam giac vuong can");
        chieuC = sc.nextInt();

        while (chieuC <= 0){
            System.out.println("Mơi ban nhap lai chieu dai ");
            chieuC = sc.nextInt();
        }

        for (i = 0; i < chieuC ; i++ ){
            for (j = 0; j < i; j++){ //tai sao i bang 0
                System.out.print("x ");
            }
            System.out.println("x ");
        }
    }


}
