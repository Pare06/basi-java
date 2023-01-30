import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // PARTE 1

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int input;
        do {
            System.out.print("Inserisci un numero (-1 per terminare): ");
            input = sc.nextInt();
            list.add(input);
        } while (input != -1);

        System.out.print("Inserisci l'indice massimo da cercare: ");
        input = sc.nextInt();
        if (input < 1) {
            throw new IllegalArgumentException();
        }

        System.out.println(String.format("Il numero casuale scelto è %s\n\n", randomElement(list, input)));

        // PARTE 2

        Studente pare = new Studente("Jacopo", "Parenti");
        Studente ticciati = new Studente("Manuel", "Ticciati");

        pare.verifica(8.5);
        pare.verifica(6.5);
        pare.calcolaBocciatura();
        ticciati.verifica(0.5);
        ticciati.verifica(1.5);
        ticciati.verifica(0.75);
        ticciati.verifica(0);
        ticciati.calcolaBocciatura();

        System.out.println(String.format("pare %s", assignRating(pare)));
        System.out.println(String.format("ticciati %s", assignRating(ticciati)));
    }

    public static int randomElement(List<Integer> list, int maxIndex) {
        if (maxIndex >= list.size()) {
            throw new IndexOutOfBoundsException();
        }

        return list.get(new Random().nextInt(0, maxIndex));
    }

    public static String assignRating(Studente studente) {
        return switch (studente.getEsame()) {
            case BOCCIATO -> "lol sei un tumore";
            case RIMANDATO -> "bruh letteralmente gabriele la bella";
            case PASSATO -> "ez clap";
            case NON_CALCOLATO -> "sei autistico";
        };
    }

}