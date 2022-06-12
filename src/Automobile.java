public class Automobile {

    // Informazioni oggetto Automobile
    private String nome;
    public int cilindrata;
    private String targa;
    private Double prezzo;
    private String colore;
    private int numeroMarce;
    private boolean motoreAcceso;
    private int marcia;

    public Automobile(String nome, int cilindrata, String targa, double prezzo, String colore, int numeroMarce) {
        this.nome = nome;
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.prezzo = prezzo;
        this.colore = colore;
        this.numeroMarce = numeroMarce;
    }

    // Metodi oggetto Automobile
    public void accendiMotore() {
        setMotoreAcceso(true);
    }

    public void spegniMotore() {
        setMotoreAcceso(false);
        marcia = 0;
    }

    public void cambiaMarcia(int marcia) {
        if (getMarcia() > 0 && getMarcia() < numeroMarce) {
            setMarcia(marcia);
        } else {
            System.out.println("Errore nella gestione delle marce!");
            setMarcia(0);
        }
    }

    public void scalaMarcia() {
        if (getMarcia() > 0 && getMarcia() < numeroMarce) {
            getMarcia();
        } else {
            System.out.println("Errore nella gestione delle marce!");
            setMarcia(0);
        }
    }

    public void aumentaMarcia() {
        if (getMarcia() > 0 && getMarcia() < numeroMarce) {
            setMarcia(getMarcia() + 1);

        } else {
            System.out.println("Errore nella gestione delle marce!");
            setMarcia(0);
        }
    }

    // GETTER

    public boolean isMotoreAcceso() {
        return motoreAcceso;
    }

    public int getMarcia() {
        return marcia;
    }

    public String getNome() {
        return nome;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public double getValore() {
        return prezzo;
    }

    public String getColore() {
        return colore;
    }

    public int getNumeroMarce() {
        return numeroMarce;
    }

    // SETTER

    public void setMarcia(int marcia) {
        this.marcia = marcia;
    }

    public void setMotoreAcceso(boolean motoreAcceso) {
        this.motoreAcceso = motoreAcceso;
    }

    public String stampaInformazioni() {
        return getNome() + "\n" +
                "La cilindrata dell'auto è " + getCilindrata() + " cc" + "\n" +
                "La targa dell'auto è " + getTarga() + "\n" +
                "Il colore dell'auto è " + getColore() + "\n" +
                "Il prezzo dell'auto è " + getValore() + " $" + "\n" +
                "------------------";           

    }

}
