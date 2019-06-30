package dubbo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:dubbo-conf/*.xml")
@SpringBootApplication
public class DubboProviderApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
	}
	
}
