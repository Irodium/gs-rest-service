package hello;

/**
 * Created by Jeff on 12/04/2016.
 */
public class TempsTotal {
    private final long id_rqt;
    private final String adresseDepart;
    private final String adresseArrivee;
    private int tempsEstimeNB;
    private int risqueChHum;
    private String tempsEstime;

    public TempsTotal(long id, String adresseDepart, String adresseArrivee) {
        this.id_rqt = id;
        this.adresseDepart = adresseDepart;
        this.adresseArrivee = adresseArrivee;
        tempsEstimeNB = 0;
        tempsEstime = "";
        risqueChHum = 0;
        calculer();
    }

    public TempsTotal(String adresseDepart, String adresseArrivee) {
        this.id_rqt = 0;
        this.adresseDepart = adresseDepart;
        this.adresseArrivee = adresseArrivee;
        tempsEstimeNB = 0;
        tempsEstime = "";
        risqueChHum = 0;
        calculer();
    }

    public void calculer()
    {
        String stationDepart;
        String stationArrivee;

        StationNonVide stationD = new StationNonVide(adresseDepart);
        stationDepart = stationD.getStation1();

        StationNonPlein stationA = new StationNonPlein(adresseArrivee);
        stationArrivee = stationA.getStation1();

        TempsPieds tpsPiedsD = new TempsPieds(adresseDepart,stationDepart);
        int tpsPiedsD_NB = tpsPiedsD.getTempsEstimeNB();
        TempsPieds tpsPiedsA = new TempsPieds(stationArrivee,adresseArrivee);
        int tpsPiedsA_NB = tpsPiedsA.getTempsEstimeNB();
        TempsPieds tpsVelo = new TempsPieds(stationDepart,stationArrivee);
        int tpsVelo_NB = tpsVelo.getTempsEstimeNB() /2 ;

        ChausseeHumide chauHum = new ChausseeHumide(adresseDepart);
        risqueChHum = chauHum.getRisqueNB();

        tempsEstimeNB = tpsPiedsA_NB+tpsVelo_NB+tpsPiedsD_NB;
    }

    public String getAdresseDepart() {

        return adresseDepart;
    }

    public String getAdresseArrivee() {
        return adresseArrivee;
    }

    public String getTempsEstime() {
        return (tempsEstimeNB + " minutes. Avec un risque de chaussee humide de "
                + risqueChHum + " %. Si la chaussée est humide la progression sera " +
                "ralentie de 30%. Temps estime avec chaussee humide : " +
                tempsEstimeNB*1.3 + " minutes.");
    }
}
