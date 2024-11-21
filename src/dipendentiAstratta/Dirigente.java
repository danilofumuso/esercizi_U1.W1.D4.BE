package dipendentiAstratta;

import dipendenti.Dipartimento;

public class Dirigente extends Dipendente{

    public Dirigente(String matricola) {
        super(matricola,Dipartimento.AMMINISTRAZIONE);
    }

    @Override
    public double calcolaStipendio() {
        return (this.getStipendio()*2);
    }
}
