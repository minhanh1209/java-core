package exception.nganhang;

public class Account {

    String Ten;
    String maSo;
    int soDu;

    public Account(String ten, String maSo, int soDu) {
        this.Ten = ten;
        this.maSo = maSo;
        this.soDu = soDu;
    }

    public Account(){
    }

    @Override
    public String toString() {
        return "Account{" +
                "Ten la ='" + Ten + '\'' +
                ", Tai khoan ='" + maSo + '\'' +
                ", So Du TK = " + soDu +
                '}';
    }
}
