package exception.demo;

import java.util.*;

public class exception {
    public static void main(String[] args){

        NhanVien nhanVien = new NhanVien("duy","123");
        List<NhanVien>nhanViens = new ArrayList<NhanVien>();
        nhanViens.add(nhanVien);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap username:");
        String username = sc.nextLine();
        System.out.println("Nhap password:");
        String password = sc.nextLine();
        for (NhanVien nv:nhanViens){
            if (username.equalsIgnoreCase(nv.getUsername()) &&
                password.equalsIgnoreCase(nv.getPassword())){
                System.out.println(nhanVien.toString());
            }else {
                throw new UserNotFoundException(SystemMessage.MESSAGE_USER_NOT_FOUND+username);
            }
        }

    }

}
