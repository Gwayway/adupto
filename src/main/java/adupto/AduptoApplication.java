package adupto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AduptoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AduptoApplication.class, args);
    }

}
