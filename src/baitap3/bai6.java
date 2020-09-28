package baitap3;

public class bai6 {
    public static void main(String[] args) {
        int s1 = 1;
        int s2 = 1;
        int s3 = 1;
        System.out.print(" " + s1 + " ");
        System.out.print(" " + s2 + " ") ;
        while ( s3 > 0 ){
            s1 = s2 ;
            s2 = s3;
            s3 = s1 + s2;
            System.out.print(" " + s3 + " ");
        }
    }
}
