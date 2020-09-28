package baiTapOpp.HinhTron;

import java.util.Random;
import java.util.Scanner;
public class Circle extends Point implements Shape{
    int dy, dx;
    int radius;
    int color;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        int luaChon;
        do {
            System.out.println("--------------menu---------------");
            System.out.println("1. Tao hinh tron ");
            System.out.println("2. Di chuyen duong tron");
            System.out.println("3. Ve hinh tron");
            System.out.println("4. Tinh dien tich hinh tron");
            System.out.println("5. Exit");
            System.out.println("Nhap lua chon");
            luaChon = sc.nextInt();
            while (luaChon < 1 || luaChon > 5){
                System.out.print("Ban da nhap sai lua chon, moi ban nhap lai ");
                luaChon = sc.nextInt();
            }
            switch (luaChon){
                case 1:
                    Random rd = new Random();
                    circle.radius = rd.nextInt(1000);
                    circle.color = rd.nextInt(1000);
                    circle.x = rd.nextInt(10000);
                    circle.y = rd.nextInt(10000);
                    System.out.println("Da tao 1 hinh tron");
                    break;
                case 2:
                    System.out.print("Nhap vao toa do di theo chieu dung ");
                    int dy = circle.dy = sc.nextInt();
                    System.out.print("Nhap vao toan do di chuyen theo chieu ngang ");
                    int dx = circle.dx = sc.nextInt();
                    circle.move(dx,dy);
                    break;
                case 3:
                    circle.draw();
                    break;
                case 4:
                    circle.area();
                    break;
                default:
                    System.out.println("-----------------BYE---------------") ;
                    break;
            }
        } while (luaChon < 5);
    }

    public Circle(int x, int y, int radius, int color) {
        super(x, y);
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("x = " + x);
        System.out.println("y = "+ y);
        System.out.println("ban kinh = " +radius);
        System.out.println("mau = " +color);
    }

    @Override
    public void area() {
        double S = pi * Math.pow(radius, 2);
        System.out.println("Dien tich hinh tron la " + S);

    }

    public Circle() {
        super();
    }

}
