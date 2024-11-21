package dipendentiAstratta;

import dipendenti.Dipartimento;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(String matricola) {
        super(matricola, Dipartimento.PRODUZIONE);
    }

    @Override
    public double calcolaStipendio() {
        return this.getStipendio();
    }
}
