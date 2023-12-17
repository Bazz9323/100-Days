import java.util.Random;

public class Hari72_RandomKata {
    public static void main(String[] args) {
        Random random = new Random();
        String [] arrayKata = {"aku","kamu","dia"};
        String [] arrayKata2 = {"rindu","suka","benci"};
        String [] arrayKata3 = {"kamu","aku","dia"};
        int indexKata= random.nextInt(arrayKata.length);
        int indexKata2= random.nextInt(arrayKata2.length);
        int indexKata3= random.nextInt(arrayKata3.length);
        String kata = arrayKata[indexKata];
        String kata2 = arrayKata2[indexKata2];
        String kata3 = arrayKata3[indexKata3];
        System.out.println(kata+" "+kata2+" "+kata3);
    }
}
