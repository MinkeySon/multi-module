package kr.co.handmk.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "kr.co.handmk")
@EnableJpaRepositories(basePackages = "kr.co.handmk")
@EntityScan(basePackages = "kr.co.handmk")
public class ModuleApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ModuleApiApplication.class, args);
    }
}
