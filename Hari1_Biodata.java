import java.util.Scanner;

public class Hari1_Biodata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama anda: ");
        String nama = input.next();
        System.out.println("Masukkan umur anda: ");
        int umur = input.nextInt();
        System.out.println("Masukkan alamat anda: ");
        String alamat = input.next();
        System.out.println("Masukkan no hp anda: ");
        int noHp = input.nextInt();

        System.out.println("Nama\t\t\t: "+nama);
        System.out.println("Umur\t\t\t: "+umur);
        System.out.println("Alamat\t\t\t: "+alamat);
        System.out.println("No.HP\t\t\t: "+noHp);
    }
}
