import java.util.Scanner;

public class Main {

    static void infoAutomobilePiuCostosa(Automobile[] automobili) {
        Automobile autoCostosa = null;
        double valore = 0;
        for (Automobile auto : automobili) {
            if (auto.getValore() > valore) {
                valore = auto.getValore();
                autoCostosa = auto;
            }
        }
        System.out.println("\n L'auto più costosa nella nostra autofficina: " + autoCostosa.stampaInformazioni());
    }

    // Sistema ricerca targa
    static void infoAutomobile(Automobile[] automobili, String targa) {
        int control = 0;
        for (Automobile auto : automobili) {
            if (auto.getTarga().equals(targa)) {
                System.out.println("L Automobile con targa -" + targa + "- e':\n" + auto.stampaInformazioni());
                control++;
            }
        }
        if (control == 0) {
            System.out.println("Non c'è nessuna automobile con la targa inserita! (" + targa + ")\n");
        }
    }

    // Sistema ricerca colore
    static void infoAutomobileColore(Automobile[] macchine, String colore) {
        int control = 0;
        for (Automobile auto : macchine) {
            if (auto.getColore().equals(colore)) {
                System.out.println(
                        "La/Le auto per colore richiesto -" + colore + "- e'/sono : \n " + auto.stampaInformazioni());
                control++;
            }
        }
        if (control == 0) {
            System.out.println("Non c'è nessuna automobile di questo colore! (" + colore + ")\n");
        }
    }

    public static void main(String[] args) {

        Automobile[] auto = new Automobile[5];

        Automobile auto1 = new Automobile("Citroen Berlingo", 1600, "ZZ123GC", 7000, "rosso", 5);
        Automobile auto2 = new Automobile("Miata", 1200, "QQ124GU", 3200.50, "blu", 6);
        Automobile auto3 = new Automobile("Fiat Panda", 1400, "AB675QQ", 3400, "rosso", 5);
        Automobile auto4 = new Automobile("Citroen C3", 1400, "AB675QQ", 3400, "nero", 5);
        Automobile auto5 = new Automobile("Mazda", 1200, "CC575LQ", 5000, "nero", 6);

        auto[0] = auto1;
        auto[1] = auto2;
        auto[2] = auto3;
        auto[3] = auto4;
        auto[4] = auto5;

        infoAutomobilePiuCostosa(auto);

        try (Scanner scan = new Scanner(System.in)) {
            // Sistema ricerca targa
            System.out.println("\n  Sistema ricerca tramite targa \n ");
            System.out.println("Inserisci una targa per cercarla: \n ");
            String targa = scan.next();
            infoAutomobile(auto, targa);

            // Sistema ricerca colore
            System.out.println("\n  Sistema ricerca tramite colore \n ");
            System.out.println("Inserisci un colore: \n ");
            String colore = scan.next();
            infoAutomobileColore(auto, colore);
        }
    }

}
