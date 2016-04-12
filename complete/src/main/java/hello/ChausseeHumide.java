package hello;

/**
 * Created by Jeff on 11/04/2016.
 */
public class ChausseeHumide {
    private final long id_rqt;
    private final String adresseDepart;
    private String risque;
    private int risqueNB;


    public ChausseeHumide(long id, String adresseDepart) {
        this.id_rqt = id;
        this.adresseDepart = adresseDepart;
        risque = "";
        risqueNB = 0;
        calculer();

    }

    public ChausseeHumide(String adresseDepart) {
        this.id_rqt = 0;
        this.adresseDepart = adresseDepart;
        risque = "";
        risqueNB = 0;
        calculer();

    }

    public void calculer()
    {
        //Requete WS pour avoir le risque de chaussee humide
        risqueNB = 20;

    }

    public long getId_rqt() {
        return id_rqt;
    }

    public String getAdresseDepart() {
        return adresseDepart;
    }

    public String getRisque()
    {
        return ("Chaussee Humide " + risqueNB + " %");
    }

    public int getRisqueNB() {
        return risqueNB;
    }
}
