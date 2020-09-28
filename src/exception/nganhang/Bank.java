package exception.nganhang;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

    int tkMax = 3;
    int nextTk = 0;
    Account[] accounts = new Account[tkMax] ;

    public Bank(){

    }

    public void Create() throws InsuffiicientFundsException {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập tên tài khoan");
            account.Ten = sc.nextLine();
            System.out.println("Nhap ma tai khoan");
            account.maSo = sc.nextLine();
            System.out.println("So du ban dau");
            account.soDu = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new InsuffiicientFundsException(SystemMessage.NHAP_SAI_KIEU_DU_LIEU);
        }
        if (account.soDu < 100) {
            throw new InsuffiicientFundsException(SystemMessage.TAI_KHOAN);
        }
        accounts[nextTk] = account;
        nextTk++;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void In(Account a){
        System.out.println(a.toString());
    }
        public void deposite() throws InsuffiicientFundsException{
            Scanner sc = new Scanner(System.in);
            String sotaikhoan;
            int tienGui;
            try {
            System.out.println("Nhap vao so tai khoan muon gui");
            sotaikhoan = sc.nextLine();
            System.out.println("Nhap so tien muon gui");
            tienGui = sc.nextInt();
            }catch (InputMismatchException e){
                throw new InsuffiicientFundsException(SystemMessage.NHAP_SAI_KIEU_DU_LIEU);
            }
            for (int i = 0; i <= accounts.length; i++) {
                if (!sotaikhoan.equalsIgnoreCase(accounts[i].maSo)) {
                    throw new InsuffiicientFundsException(SystemMessage.SAI_TAI_KHOAN);
                }
                if (tienGui < 0){
                    throw new InsuffiicientFundsException(SystemMessage.TIEN_GUI);
                }
                System.out.println("Ban da nap tien thanh cong");
                accounts[i].soDu += tienGui;
                In(accounts[i]);
                break;
            }
        }
    public void withdraw() throws InsuffiicientFundsException{
        Scanner sc = new Scanner(System.in);
        String sotaikhoan;
        int tienRut;
        try {
            System.out.println("Nhap vao so tai khoan muon rut");
            sotaikhoan  = sc.nextLine();
            System.out.println("Nhap so tien muon rut");
            tienRut = sc.nextInt();
        }catch (InputMismatchException e) {
            throw new InsuffiicientFundsException(SystemMessage.NHAP_SAI_KIEU_DU_LIEU);
        }
        for (int i = 0; i <= nextTk; i++) {
            if (!sotaikhoan.equalsIgnoreCase(accounts[i].maSo)) {
                throw new InsuffiicientFundsException(SystemMessage.SAI_TAI_KHOAN);
            }
            if (tienRut < 0 && tienRut > accounts[i].soDu){
                throw new InsuffiicientFundsException(SystemMessage.TIEN_RUT);
            }
            System.out.println("Ban da nap tien thanh cong");
            accounts[i].soDu -= tienRut;
            In(accounts[i]);
            break;
        }
    }
}