public class Hari17_TukarNilai {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("sebelum diubah\n"+a+" dan "+b);

        int c = a;
         a = b;
         b = c;

        System.out.println("setelah diubah\n"+a+" dan "+b);
    }
}
