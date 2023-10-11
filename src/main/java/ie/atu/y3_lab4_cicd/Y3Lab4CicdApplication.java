package ie.atu.y3_lab4_cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Y3Lab4CicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(Y3Lab4CicdApplication.class, args);
    }

}
