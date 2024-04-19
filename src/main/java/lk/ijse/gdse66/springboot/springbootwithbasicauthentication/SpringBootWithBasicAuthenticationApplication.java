package lk.ijse.gdse66.springboot.springbootwithbasicauthentication;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootWithBasicAuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithBasicAuthenticationApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
