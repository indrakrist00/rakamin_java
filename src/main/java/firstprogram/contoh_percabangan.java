package firstprogram;
import java.util.Scanner;

public class contoh_percabangan {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = prompt ("Enter Password: ");
        String validpassword = "password";

        if(password.equals(validpassword)){
            System.out.println("Selamat datang Bos");
        } else {
            System.out.println("Password salah Bos");
        }
        System.out.println("Terimakasih sudah pakai aplikasi kami");
    }

    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
