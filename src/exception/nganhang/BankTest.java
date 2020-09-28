package exception.nganhang;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) throws InsuffiicientFundsException {
        int luachon;
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

    do {
        menu();
         luachon = sc.nextInt();
         switch (luachon){
             case 1:
                 bank.Create();
                 break;
             case 2:
                 bank.deposite();
                 break;
             case 3:
                 bank.withdraw();
                 break;
             case 4:
                 System.out.println("------------BYE---------------");
                 break;
             default:
                 throw new InsuffiicientFundsException(SystemMessage.NHAP_SAI_KIEU_DU_LIEU);
         }
    } while (luachon < 5 && luachon > 0);
    }

    public static void menu() {
            System.out.println("---------menu------------");
            System.out.println("1. Tạo 1 tài khoản");
            System.out.println("2. Gửi tiền");
            System.out.println("3. Rút tiền");
            System.out.println("4. Thoát khỏi chương trình");
            System.out.println("Moi ban chon giao dịch: ");

    }
}
