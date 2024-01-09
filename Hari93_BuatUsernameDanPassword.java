import java.util.Scanner;

public class Hari93_BuatUsernameDanPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Buat Username: ");
        String buatUsername = input.nextLine();
        System.out.print("Buat Password: ");
        String buatPassword = input.nextLine();
        System.out.println("Berhasil membuat akun!!");
        System.out.print("Masukkan Username: ");
        String masukUsername = input.nextLine();
        System.out.print("Masukkan Password: ");
        String masukPassword = input.nextLine();

        if (masukUsername.equals(buatUsername) && masukPassword.equals(buatPassword)) {
            System.out.println("LOGIN BERHASIL");
        } else {
            System.out.println("LOGIN TIDAK BERHASIL");
        }
    }
}
