package dipendentiAstratta;

import dipendenti.Dipartimento;
import volontari.IAccesso;

public abstract class Dipendente implements IAccesso {

    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = 1500.00;
        this.dipartimento = dipartimento;
    }

    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calcolaStipendio();

    @Override
    public void checkIn() {
        System.out.println("Il dipendente ha effettuato il checkIn!");
    }
}
