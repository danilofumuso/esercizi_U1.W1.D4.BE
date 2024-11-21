package dipendentiAstratta;

import dipendenti.Dipartimento;

public class DipendentePartTime extends Dipendente {
    private double oreDiLavoro;
    private double orefullTime;


    public DipendentePartTime(String matricola, double oreDiLavoro) {
        super(matricola, Dipartimento.VENDITE);
        this.oreDiLavoro = oreDiLavoro;
        this.orefullTime = 40.0;
    }

    @Override
    public double calcolaStipendio() {
        return (this.getStipendio() * oreDiLavoro) / orefullTime;
    }
}
