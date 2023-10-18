package firstprogram;

import java.util.Scanner;

public class looping_while {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("are you ready? ");
        String ulangi = scanner.nextLine();
        System.out.println("Start");
        int counter = 0;

        while (ulangi.equals(1) || ulangi.equalsIgnoreCase("yes")){
            System.out.println("pengulangan ke: " + counter);
            System.out.println("apakah anda mau mengulangi? yes/no : ");
            String jawab = scanner.nextLine();
            counter++;
            if(!jawab.equalsIgnoreCase("yes")){
                ulangi = "0";
            }
        }
    }
}
