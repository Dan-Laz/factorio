public class Grado {
    private String anno;
    private String regione;
    private String percentuale;

    public Grado(String anno, String regione, String percentuale) {
        setAnno(anno);
        setPercentuale(percentuale);
        setRegione(regione);
    }

    public String getAnno() {
        return anno;
    }

    public String getRegione() {
        return regione;
    }

    public String getPercentuale() {
        return percentuale;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public void setPercentuale(String percentuale) {
        this.percentuale = percentuale;
    }
}
