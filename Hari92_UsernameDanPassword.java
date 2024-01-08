import java.util.Scanner;
public class Hari92_UsernameDanPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Username: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Password: ");
        String password = input.nextLine();
        if (nama.equals("Buzz") && password.equals("MrBuzz2024")) {
            System.out.println("LOGIN BERHASIL");
        } else {
            System.out.println("LOGIN TIDAK BERHASIL");
        }
    }
}
