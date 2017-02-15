package de.redmann.multitool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by redmann on 04.08.16.
 */
@SpringBootApplication
@EnableScheduling
@Slf4j
public class Main
{
	
	public static void main(String[] args)
	{
		log.debug("Start POS CMS");
		SpringApplication.run(Main.class, args);
	}
	
}
