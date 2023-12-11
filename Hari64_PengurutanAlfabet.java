import java.util.Scanner;

public class Hari64_PengurutanAlfabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char alfabet;
        for (alfabet =  input.next().charAt(0); alfabet <= 'z'; ++alfabet) {
            System.out.print(alfabet + " ");
        }
    }
}
