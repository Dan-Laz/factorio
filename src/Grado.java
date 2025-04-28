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

    public String toString(){
        return "anno: "+anno+"; regione: "+regione+"; percentuale: "+percentuale;
    }

    public boolean equals(Object o){
        if (o instanceof Grado){
            Grado g = (Grado) o;
            if (g.getAnno().equals(this.getAnno()) && g.getRegione().equals(this.getRegione()) && g.getPercentuale().equals(this.getPercentuale())){
                return true;
            }
        }
        return false;
    }
}
