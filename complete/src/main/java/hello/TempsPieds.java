package hello;

/**
 * Created by Jeff on 12/04/2016.
 */
public class TempsPieds {
    private final long id_rqt;
    private final String adresseDepart;
    private final String adresseArrivee;
    private int tempsEstimeNB;
    private String tempsEstime;


    public TempsPieds(long id, String adresseDepart, String adresseArrivee) {
        this.id_rqt = id;
        this.adresseDepart = adresseDepart;
        this.adresseArrivee = adresseArrivee;
        tempsEstimeNB = 0;
        tempsEstime = "";
        calculer();
    }

    public TempsPieds(String adresseDepart, String adresseArrivee) {
        this.id_rqt = 0;
        this.adresseDepart = adresseDepart;
        this.adresseArrivee = adresseArrivee;
        tempsEstimeNB = 0;
        tempsEstime = "";
        calculer();
    }

    public void calculer()
    {
        //Requete WS pour avoir le risque de chaussee humide
        tempsEstimeNB = 15;
    }

    public long getId_rqt() {
        return id_rqt;
    }

    public String getAdresseDepart() {
        return adresseDepart;
    }

    public String getAdresseArrivee() {
        return adresseArrivee;
    }

    public String getTempsEstime() {
        return (tempsEstimeNB + " minutes");
    }

    public int getTempsEstimeNB() {
        return tempsEstimeNB;
    }
}
