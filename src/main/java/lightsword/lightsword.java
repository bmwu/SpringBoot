package lightsword;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by michael on 8/2/17.
 */
@SpringBootApplication
@RestController
public class lightsword {

    public static void main(String[] args) {
        SpringApplication.run(lightsword.class, args);
        System.out.println("Hello world");
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
