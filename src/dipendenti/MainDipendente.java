package dipendenti;

public class MainDipendente {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente("01D232", 1500.00, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente("02D982", 1750.00, Dipartimento.VENDITE);
        Dipendente dipendente3 = new Dipendente("03D092", 2000.00, Dipartimento.AMMINISTRAZIONE);

        Dipendente[] dipendenti = new Dipendente[3];

        dipendenti[0] = dipendente1;
        dipendenti[1] = dipendente2;
        dipendenti[2] = dipendente3;

        for (int i = 0; i < dipendenti.length ; i++) {
            System.out.println("Matricola dipendente: " + dipendenti[i].getMatricola() );
        }


    }

}
