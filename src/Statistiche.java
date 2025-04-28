import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Statistiche {
    ArrayList<Grado> statistiche;


    public Statistiche(){
        statistiche = new ArrayList<Grado>();
    }

    public boolean read(){
        try(BufferedReader in = new BufferedReader(new FileReader("Grado-diffusione-del-PC-nelle-imprese-con-meno-di-10-addetti.csv"))){
            statistiche.clear();
            // intestazione
            String line = in.readLine();
            while ((line = in.readLine())!= null){
                String[] valori = line.split(";");
                statistiche.add(new Grado(valori[0],valori[1],valori[2]));
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public ArrayList<String> creaReport(){
        // restituisce un array di stringhe, ognuna per ogni regione che descrivono i dati per regione
        return null;
    }
}
