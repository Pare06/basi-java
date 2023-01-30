public class Professore implements Umano {
    private String nome;
    private String cognome;

    public void saluta() {
        System.out.println(String.format("Ciao, sono %s %s e sono un professore!", nome, cognome));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
