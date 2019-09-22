package org.saheb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication(scanBasePackages="org.saheb.jms")
@EnableJms
public class StandaloneActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandaloneActivemqApplication.class, args);
	}

}
