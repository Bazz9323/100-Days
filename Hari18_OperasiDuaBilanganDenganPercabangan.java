import java.util.Scanner;

public class Hari18_OperasiDuaBilanganDenganPercabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int bilangan1 = input.nextInt();
        System.out.println("Penjumlahan ( + )\nPengurangan ( - )\nPerkalian ( x )\nPembagian ( / )\nIsi sesuai simbol yang dibutuhkan : ");
        String operasi = input.next();
        System.out.println("Masukkan angka : ");
        int bilangan2 = input.nextInt();

        if(operasi.equals("+")){
            System.out.println(bilangan1+" + "+bilangan2+" = "+(bilangan1+bilangan2));
        } else if (operasi.equals("-")) {
            System.out.println(bilangan1+" - "+bilangan2+" = "+(bilangan1-bilangan2));
        } else if (operasi.equalsIgnoreCase("x")) {
            System.out.println(bilangan1+" x "+bilangan2+" = "+(bilangan1*bilangan2));
        } else if (operasi.equals("/")) {
            System.out.println(bilangan1+" / "+bilangan2+" = "+(bilangan1/bilangan2));
        } else {
            System.out.println("Masukkan operasi dengan benar");
        }
    }
}
