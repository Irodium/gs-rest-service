package hello;

/**
 * Created by Jeff on 11/04/2016.
 */
public class StationNonVide {
    private final long id_rqt;
    private final String adresseDepart;
    private String station1;
    private int restantsStation1;
    private String station2;
    private int restantsStation2;
    private String station3;
    private int restantsStation3;

    public StationNonVide(long id, String adresseDepart) {
        this.id_rqt = id;
        this.adresseDepart = adresseDepart;
        station1 = "";
        restantsStation1 = 0;
        station2 = "";
        restantsStation2 = 0;
        station3 = "";
        restantsStation3 = 0;
        calculer();
    }

    public StationNonVide(String adresseDepart) {
        this.id_rqt = 0;
        this.adresseDepart = adresseDepart;
        station1 = "";
        restantsStation1 = 0;
        station2 = "";
        restantsStation2 = 0;
        station3 = "";
        restantsStation3 = 0;
        calculer();
    }

    public void calculer()
    {
        //Requete WS pour avoir les stations
        station1 = "Duchesse Anne";
        restantsStation1 = 4;
        station2 = "Michelet";
        restantsStation2 = 3;
        station3 = "Bourgeonnière";
        restantsStation3 = 7;
    }

    public long getId_rqt() {
        return id_rqt;
    }

    public String getAdresseDepart() {
        return adresseDepart;
    }

    public String getStation1() {
        return station1;

    }

    public int getRestantsStation1() {
        return restantsStation1;
    }

    public String getStation2() {
        return station2;
    }

    public int getRestantsStation2() {
        return restantsStation2;
    }

    public String getStation3() {
        return station3;
    }

    public int getRestantsStation3() {
        return restantsStation3;
    }
}
