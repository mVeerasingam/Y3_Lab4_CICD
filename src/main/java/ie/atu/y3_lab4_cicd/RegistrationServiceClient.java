package ie.atu.y3_lab4_cicd;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Confirmation-service", url = "http://localhost:8080")
public interface RegistrationServiceClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody UserDetails userDetails);
}
