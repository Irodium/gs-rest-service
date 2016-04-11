package hello;

/**
 * Created by Jeff on 11/04/2016.
 */
public class Salut {
    private final long id;
    private final String content;
    private int contentAge;
    private String station;

    public Salut(long id, String content, int contentAge) {
        this.id = id;
        this.content = content;
        this.contentAge = contentAge;
        station = "";
        calculer();

    }

    public void calculer()
    {
        contentAge = contentAge * 10;
        station = "Duchesse Anne";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int getAge() {return contentAge;}

    public String getStation() {return station;}
}
