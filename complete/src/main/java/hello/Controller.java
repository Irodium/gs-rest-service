package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/non_vide")
    public StationNonVide non_vide(
            @RequestParam(value="adresse", defaultValue="Place du Capitole") String name)
    {

        return new StationNonVide(counter.incrementAndGet(),name);
    }

    @RequestMapping("/non_plein")
    public StationNonPlein non_plein(
            @RequestParam(value="adresse", defaultValue="Place du Capitole") String name)
    {

        return new StationNonPlein(counter.incrementAndGet(),name);
    }

    @RequestMapping("/chaussee_humide")
    public ChausseeHumide humide(
            @RequestParam(value="adresse", defaultValue="Place du Capitole") String name)
    {

        return new ChausseeHumide(counter.incrementAndGet(),name);
    }

    @RequestMapping("/temps_pieds")
    public TempsPieds temps_pieds(
            @RequestParam(value="adressedepart", defaultValue="Place du Capitole") String adrDep,
            @RequestParam(value="adressearrivee", defaultValue="Place du Capitole") String adrArr)

    {

        return new TempsPieds(counter.incrementAndGet(),adrDep, adrArr);
    }

    @RequestMapping("/temps_total")
    public TempsTotal temps_total(
            @RequestParam(value="adressedepart", defaultValue="Place du Capitole") String adrDep,
            @RequestParam(value="adressearrivee", defaultValue="Place du Capitole") String adrArr)

    {

        return new TempsTotal(counter.incrementAndGet(),adrDep, adrArr);
    }

}
