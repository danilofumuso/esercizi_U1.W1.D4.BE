package volontari;

public class Volontario implements IAccesso {
    private String nomeCompleto;
    private int eta;
    private String curriculumVitae;

    public Volontario(String nomeCompleto, int eta, String curriculumVitae) {
        this.nomeCompleto = nomeCompleto;
        this.eta = eta;
        this.curriculumVitae = curriculumVitae;
    }

    @Override
    public void checkIn() {
        System.out.println("il volontario ha effettuato il checkIn!");
    }
}
