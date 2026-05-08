package dev.brushedtomas.citas_vm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CitasVmApplication {
	public static void main(String[] args) {
		SpringApplication.run(CitasVmApplication.class, args);
	}
}