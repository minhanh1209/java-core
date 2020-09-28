package demoJava;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int max;

        System.out.println("nhap a");
        a = sc.nextInt();
        System.out.println("nhap b");
        b = sc.nextInt();
        System.out.println("nhap c");
        c = sc.nextInt();

        max = a;
        if (max < b ){
            max = b;
            if (max < c){
                max = c;
            }
        }



    }
}
