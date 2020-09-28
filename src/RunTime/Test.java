package RunTime;

public class Test {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("Caculator.exe");
        }catch (Exception e){
            System.out.println("error");
        }
    }
}
