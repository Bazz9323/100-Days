import java.util.Scanner;

public class Hari25_GenapPositif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan angka awal: ");
        int awal = input.nextInt();
        System.out.println("masukkan batas angka: ");
        int batas = input.nextInt();

        for (int i = awal; i <= batas; i++) {
            if(i%2==0 && i>0){
                System.out.println(i);
            }
        }
    }
}
