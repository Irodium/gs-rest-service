package hello;

/**
 * Created by Jeff on 11/04/2016.
 */
public class StationNonPlein {
    private final long id_rqt;
    private final String adresseArrivee;
    private String station1;
    private int placesStation1;
    private String station2;
    private int placesStation2;
    private String station3;
    private int placesStation3;

    public StationNonPlein(long id, String adresseArrivee) {
        this.id_rqt = id;
        this.adresseArrivee = adresseArrivee;
        station1 = "";
        placesStation1 = 0;
        station2 = "";
        placesStation2 = 0;
        station3 = "";
        placesStation3 = 0;
        calculer();
    }

    public StationNonPlein(String adresseArrivee) {
        this.id_rqt = 0;
        this.adresseArrivee = adresseArrivee;
        station1 = "";
        placesStation1 = 0;
        station2 = "";
        placesStation2 = 0;
        station3 = "";
        placesStation3 = 0;
        calculer();
    }

    public void calculer()
    {
        //Requete WS pour avoir les stations
        station1 = "Petit Port";
        placesStation1 = 1;
        station2 = "Commerce";
        placesStation2 = 8;
        station3 = "Pirmil";
        placesStation3 = 4;
    }

    public long getId_rqt() {
        return id_rqt;
    }

    public String getAdresseArrivee() {
        return adresseArrivee;
    }

    public String getStation1() {
        return station1;

    }

    public int getPlacesStation1() {
        return placesStation1;
    }

    public String getStation2() {
        return station2;
    }

    public int getPlacesStation2() {
        return placesStation2;
    }

    public String getStation3() {
        return station3;
    }

    public int getPlacesStation3() {
        return placesStation3;
    }
}
