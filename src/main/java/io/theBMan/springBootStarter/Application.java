package io.theBMan.springBootStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "io.theBMan.springBootStarter.lecture"
})
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
