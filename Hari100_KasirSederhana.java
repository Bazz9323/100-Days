import java.util.Scanner;

public class Hari100_KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________________MENU_________________");
        System.out.println("A. NASI GORENG\t\tRp.15.000");
        System.out.println("B. MIE GORENG\t\tRp.17.000");
        System.out.println("C. BAKSO\t\t\tRp.13.000");
        System.out.println("D. NASI KUNING\t\tRp.15.000");
        System.out.println("PILIH MENU SESUAI HURUF : ");
        String pesan = input.nextLine();
        if(pesan.equalsIgnoreCase("a")){
            System.out.println("MASUKKAN JUMLAH PESANAN : ");
            int jumlahPesan = input.nextInt();
            int total = 15000*jumlahPesan;
            System.out.println("TOTAL HARGA : "+total);
        } else if (pesan.equalsIgnoreCase("b")) {
            System.out.println("MASUKKAN JUMLAH PESANAN : ");
            int jumlahPesan = input.nextInt();
            int total = 17000*jumlahPesan;
            System.out.println("TOTAL HARGA : "+total);
        } else if (pesan.equalsIgnoreCase("c")) {
            System.out.println("MASUKKAN JUMLAH PESANAN : ");
            int jumlahPesan = input.nextInt();
            int total = 13000*jumlahPesan;
            System.out.println("TOTAL HARGA : "+total);
        } else if (pesan.equalsIgnoreCase("d")) {
            System.out.println("MASUKKAN JUMLAH PESANAN : ");
            int jumlahPesan = input.nextInt();
            int total = 15000*jumlahPesan;
            System.out.println("TOTAL HARGA : "+total);
        }else{
            System.out.println("PESANAN TIDAK TERDAFTAR PADA MENU");
        }
    }
}
