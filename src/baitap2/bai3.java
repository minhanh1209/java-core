package baitap2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        float x,x1,x2;
        float delta;

        System.out.println("nhap vao a =");
        a = sc.nextFloat();
        System.out.println("nhap vao b = ");
        b = sc.nextFloat();
        System.out.println("nhap vao c =");
        c = sc.nextFloat();

        delta = (float) Math.pow(b,2) -4*a*c;
        if (a==0 ) {
            if (b != 0) {
                x = -c / b;
                System.out.println("phuong trinh la phuong bac nhat co nghiem là x=" + x + ".");
            }
            else if (c == 0) {
                System.out.println("phuong trinh vo so nghiem");
            }
            else {
                System.out.println("phuong trinh vo nghiem");
            }
        }

        else {
            if (delta < 0) {
                System.out.println(" phuong trinh vo nghiem ");
            }
            else if (delta == 0) {
                x1 = (-b) / (2*a);
                System.out.println("phuong trinh co nghiem duy nhat x1=x2=" + x1 + ".");
            }
            else {
                x1 = (float) (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (float) (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co hai nghiem phan biet x1=" + x1 + " 2" +
                        "x2=" + x2 + ".");
            }
        }

    }

}
