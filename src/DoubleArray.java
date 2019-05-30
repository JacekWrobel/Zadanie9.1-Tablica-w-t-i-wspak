import java.util.Arrays;
import java.util.Random;

public class DoubleArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arrayStart = new int[10];
        for (int i = 0; i < arrayStart.length; i++) {
            arrayStart[i] = rand.nextInt(100);

        }
        String arrayInString = Arrays.toString(arrayStart);
        System.out.println(arrayInString);

        for (int i = 0, j= arrayStart.length -1; i <  j; i++, j--) {
            System.out.print(arrayStart[i]+" ");
            System.out.println(arrayStart[j] +" ");
        }
        }//tu jest koniec nie da się bez drugiej pęti zobić ifami "nawrotu"
/*
        for (int i = arrayStart.length-1; i >=0 ; i--) {
            System.out.print(arrayStart[i] + " ");
        }

 */
        /*
        Następnie w drugiej pętli wyświetl na ekranie zawartość tablicy oraz jej lustrzane odbicie.
        Do wyświetlania możesz wykorzystać tylko jedną pętlę i tą pętlą powinna być pętla for.
        Nie możesz w programie tworzyć żadnych dodatkowych tablic.
         */
    }
}
