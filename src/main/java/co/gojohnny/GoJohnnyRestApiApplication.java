package co.gojohnny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoJohnnyRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoJohnnyRestApiApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello, Johnny!";
    }
}
