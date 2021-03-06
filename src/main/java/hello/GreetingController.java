package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
This code uses Spring 4’s new @RestController annotation, 
which marks the class as a controller where every method returns a domain object instead of a view. 
It’s shorthand for @Controller and @ResponseBody rolled together.
*/
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /*
    The above example does not specify GET vs. PUT, POST, and so forth, because 
    @RequestMapping maps all HTTP operations by default. 
    Use @RequestMapping(method=GET) to narrow this mapping.
    
    
    @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method. 
    This query string parameter is explicitly marked as optional (required=true by default): if it is absent in the request, the defaultValue of "World" is used.
    
    */
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
    
}