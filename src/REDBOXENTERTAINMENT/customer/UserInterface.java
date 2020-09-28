package REDBOXENTERTAINMENT.customer;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        CDCreator creator = new CDCreator();
        do {
            System.out.println(" ----------------------menu----------------------");
            System.out.println("1. Them mot CD nhac moi vao bo suu tap");
            System.out.println("2. Them mot CD phim moi vao bo suu tap");
            System.out.println("3. Hien thi toan bo CD nhac trong bo suu tap");
            System.out.println("4. Hien thi toan bo CD phim trong bi suu tap");
            System.out.println("5. Thoat chuong trinh");
            System.out.print("Moi ban chon thao tac: ");
            number = sc.nextInt();
            switch (number) {
                case 1:
                    if (creator.addMusicCD() == true){
                        creator.nhapMusic();
                    }else {
                        System.out.println("Luu tru dia da day");
                    }
                    break;
                case 2:
                    if (creator.addMovieCD() == true){
                        creator.nhapMovie();
                    }else{
                        System.out.println("Luu tru dia da day");
                    }
                    break;
                case 3:
                    creator.displayALLMusic();
                    break;
                case 4:
                    creator.displayALLMovie();
                    break;
                case 5:
                    System.out.println("Cam on hen");
                    break;
                default:
                    if (number <= 0 || number > 5) {
                        System.out.println("Ban da nhap sai cu phap, moi ban nhap lai yeu cau");
                        number = sc.nextInt();
                    }
                    break;
            }
        } while (number < 5);
    }
}
