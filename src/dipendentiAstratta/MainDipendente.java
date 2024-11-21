package dipendentiAstratta;

public class MainDipendente {
    public static void main(String[] args) {

        Dipendente dipendente1 = new DipendenteFullTime("01D255");
        Dipendente dipendente2 = new DipendentePartTime("02D888", 10.0);
        Dipendente dipendente3 = new DipendentePartTime("02D538", 32.0);
        Dipendente dipendente4 = new Dirigente("03D008");

        Dipendente[] dipendenti = new Dipendente[4];

        dipendenti[0] = dipendente1;
        dipendenti[1] = dipendente2;
        dipendenti[2] = dipendente3;
        dipendenti[3] = dipendente4;

        double stipendiTotali=0.0;

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Stipendio dipendente: " + dipendenti[i].calcolaStipendio() + "€"
                    + " Matricola Dipendente: " + dipendenti[i].getMatricola());


            stipendiTotali+= dipendenti[i].calcolaStipendio();

        }

        System.out.println("Stipendi totali: " + stipendiTotali + "€");

    }
}
