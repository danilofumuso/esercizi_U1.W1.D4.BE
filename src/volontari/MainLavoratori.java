package volontari;

import dipendentiAstratta.Dipendente;
import dipendentiAstratta.DipendenteFullTime;

public class MainLavoratori {
    public static void main(String[] args) {

        Dipendente dipendente = new DipendenteFullTime("01D353");
        Volontario volontario= new Volontario("Danilo Fumuso",33,"Il mio CV!");

        IAccesso[] accessi = new IAccesso[2];

        accessi[0]=dipendente;
        accessi[1]=volontario;

        for (int i = 0; i <accessi.length ; i++) {
            accessi[i].checkIn();
        }







    }
}
