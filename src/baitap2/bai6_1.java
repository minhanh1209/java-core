package baitap2;

import java.util.Scanner;

public class bai6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diem = 0;
        int chude = 0;
        String test;
        int bonus = 0;
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int temp4 = 0;
        do {
            System.out.println(" 1) Animal");
            System.out.println(" 2) English");
            System.out.println(" 3) Math ");
            System.out.println(" 4) Color");
            System.out.println(" 5) Exit ");
            System.out.println(" Chon chu de:  ");
            sc = new Scanner(System.in);
            chude = sc.nextInt();
            switch (chude) {
                case 1: {
                    if(temp1 != 0){
                        System.out.println("Ban da chon cau hoi nay roi moi chon cau hoi khac ");
                    }
                    else {
                        System.out.println("Con gi di bang 2 chan");
                        System.out.println("A:Vit            B:Meo");
                        String lc = sc.nextLine();

                        while (!lc.equalsIgnoreCase("a") && !lc.equalsIgnoreCase("b")) {
                            System.out.println("moi ban nhap lai dap an");
                            lc = sc.nextLine();
                        }
                        if (lc.equalsIgnoreCase("a")) {
                            System.out.println("Chuc mung ban da tra loi dung.");
                            diem += 10;
                        } else {
                            System.out.println("Ban da tra loi sai.");
                        }
                    }
                    temp1+=1;
                    break;
                }
                case 2: {
                    if(temp2 != 0){
                            System.out.println("Ban da chon cau hoi nay roi moi chon cau hoi khac ");
                        }
                    else {
                        System.out.println(" thu tu bang chu cai abc...ef");
                        System.out.println("A:G            B:D");
                        String lc = sc.nextLine();
                        while (!lc.equalsIgnoreCase("a") && !lc.equalsIgnoreCase("b")) {
                            System.out.println("moi ban nhap lai dap an");
                            lc = sc.nextLine();
                        }
                        if (lc.equalsIgnoreCase("b")) {
                            System.out.println("Chuc mung ban da tra loi dung.");
                            diem += 10;
                        } else {
                            System.out.println("Ban da tra loi sai.");
                        }
                    }
                    temp2 +=1;
                    break;
                }
                case 3: {
                    if(temp3 != 0){
                        System.out.println("Ban da chon cau hoi nay roi moi chon cau hoi khac ");
                    }
                    else {
                        System.out.println(" 1 + 1 =????");
                        System.out.println("A:hai           B:ba");
                        String lc = sc.nextLine();
                        while (!lc.equalsIgnoreCase("a") && !lc.equalsIgnoreCase("b")) {
                            System.out.println("moi ban nhap lai dap an");
                            lc = sc.nextLine();
                        }
                        if (lc.equalsIgnoreCase("a")) {
                            System.out.println("Chuc mung ban da tra loi dung.");
                            diem += 10;
                        } else {
                            System.out.println("Ban da tra loi sai.");
                        }
                    }
                    temp3 +=1;
                    break;
                }
                case 4: {
                    if(temp4 != 0){
                        System.out.println("Ban da chon cau hoi nay roi moi chon cau hoi khac ");
                    }
                    else {
                        System.out.println(" mau ca chua la mau gi ?");
                        System.out.println("A:mau do            B:mau vang");
                        String lc = sc.nextLine();
                        while (!lc.equalsIgnoreCase("a") && !lc.equalsIgnoreCase("b")) {
                            System.out.println("moi ban nhap lai dap an");
                            lc = sc.nextLine();
                        }
                        if (lc.equalsIgnoreCase("a")) {
                            System.out.println("Chuc mung ban da tra loi dung.");
                            diem += 10;
                        } else {
                            System.out.println("Ban da tra loi sai.");
                        }
                    }
                    temp4 +=1;
                    break;
                }
                case 5: {
                    switch (diem){
                        case 10:{
                            bonus = 0;
                            diem += bonus;
                            System.out.println("Bonus points earned :" + bonus + "." );
                            System.out.println("Total Score out of : " + diem + ".");
                            System.out.println("Ban hoi ngu");
                            break;
                        }
                        case 20:{
                            bonus = 2;
                            diem += bonus;
                            System.out.println("Bonus points earned :" + bonus + "." );
                            System.out.println("Total Score out of : " + diem + ".");
                            System.out.println("Ban hoi thong minh");
                            break;
                        }
                        case 30:{
                            bonus = 5;
                            diem += bonus;
                            System.out.println("Bonus points earned :" + bonus + "." );
                            System.out.println("Total Score out of : " + diem + ".");
                            System.out.println("Ban rat thong minh");
                            break;
                        }
                        case 40:{
                            bonus = 10;
                            diem += bonus;
                            System.out.println("Bonus points earned :" + bonus + "." );
                            System.out.println("Total Score out of : " + diem + ".");
                            System.out.println("Ban la thien tai");
                            break;
                        }
                        default:
                            System.out.println("ban qua ngu");
                    }
                    System.out.println("Xin cam on.Hen gap lai!!");


                }
            }
        } while (chude < 5 && chude > 0);
    }
}
