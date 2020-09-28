package nganHang;

public class Account {
    int amount;// so tien giao dich
    int balance ;// so tien con lai trong
    String maPin;

    public Account(int amount, int balance, String maPin) {
        this.amount = amount;
        this.balance = balance;
        this.maPin = maPin;
    }
    public Account(){
        this.maPin = "123";
        this.balance = 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                ", balance=" + balance +
                '}';
    }
    public int rut(int amount){
        this.balance -= amount;
        return balance;
    }
    public int gui(int amount){
        this.balance += amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }

}