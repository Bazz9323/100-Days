import java.util.Scanner;

public class Hari46_MengidentifikasiAngkaInputan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = input.nextInt();
        if(angka == 0){
            System.out.println("Ini nol");
        } else if (angka >=1 && angka <10) {
            System.out.println("Satuan");
        } else if (angka >=10 && angka <100) {
            System.out.println("Puluhan");
        }else if (angka >=100 && angka <1000) {
            System.out.println("Ratusan");
        }else if (angka >=1000 && angka <10000) {
            System.out.println("Ribuan");
        }else if (angka >=10000 && angka <100000) {
            System.out.println("Puluh Ribuan");
        }else if (angka >=100000 && angka <1000000) {
            System.out.println("Ratus Ribuan");
        }else{
            System.out.println("Udah capek saya");
        }
    }
}
