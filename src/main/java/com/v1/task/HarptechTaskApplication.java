package com.v1.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HarptechTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarptechTaskApplication.class, args);
	}
	
	static {
		String logPath = "";
		if (System.getProperty("os.name").equalsIgnoreCase("Linux")) {
			logPath = "/tmp/HarpTechTask/";
		} else {
			logPath = "D:\\\\HarpTechTask\\\\";
		}
		System.setProperty("logPath", logPath);
	}

}
