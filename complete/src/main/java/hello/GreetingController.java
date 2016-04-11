package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/salut")
    public Salut salut(
            @RequestParam(value="name", defaultValue="Jeff") String name,
            @RequestParam(value="age", defaultValue ="23") int age)
    {

        return new Salut(counter.incrementAndGet(),
                String.format(template, name), age);
    }

}
