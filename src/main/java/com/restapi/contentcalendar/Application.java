package com.restapi.contentcalendar;

import com.restapi.contentcalendar.config.ContentCalendarProperties;
import com.restapi.contentcalendar.model.Content;
import com.restapi.contentcalendar.model.Status;
import com.restapi.contentcalendar.model.Type;
import com.restapi.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
