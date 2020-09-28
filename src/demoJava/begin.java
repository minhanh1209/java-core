package demoJava;

import java.util.Scanner;

public class begin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Biến name
        String name ="";
        // biến age
        int age =0;
        // Tien hanh doc tu ban phim
        System.out.println("hay nhap ten cua ban");
        name = sc.nextLine();
        System.out.println("hay nhap do tuoi cua ban");
        age = sc.nextInt();

        // hien thi ten
        System.out.println("Ban ten la: "+ name +".");
        System.out.println("Tuoi cua ban la: "+ age +".");

    }

}
