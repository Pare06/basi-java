import java.util.ArrayList;

public class Studente implements Umano {
    private final String nome;
    private final String cognome;
    private EsitoEsame esame;
    private final ArrayList<Double> voti;

    public Studente(String n, String c) {
        nome = n;
        cognome = c;
        esame = EsitoEsame.NON_CALCOLATO;
        voti = new ArrayList<>();
    }

    @Override
    public void saluta() {
        System.out.println(String.format("Ciao, mi chiamo %s %s e sono uno studente!", nome, cognome));
    }

    public void calcolaBocciatura() {
        int materieSotto = 0;
        for (double v : voti) {
            if (v < 6) materieSotto++;
        }
        esame = switch (materieSotto) {
            case 0 -> EsitoEsame.PASSATO;
            case 1, 2, 3 -> EsitoEsame.RIMANDATO;
            default -> EsitoEsame.BOCCIATO;
        };
    }

    public void verifica(double voto) {
        voti.add(voto);
    }

    public enum EsitoEsame {
        BOCCIATO,
        RIMANDATO,
        PASSATO,
        NON_CALCOLATO
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public EsitoEsame getEsame() {
        return esame;
    }

}
