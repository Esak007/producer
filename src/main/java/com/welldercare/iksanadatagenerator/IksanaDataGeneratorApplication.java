package com.welldercare.iksanadatagenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.welldercare.iksanadatagenerator.util.CommonUtil;

@SpringBootApplication
public class IksanaDataGeneratorApplication implements CommandLineRunner {

	@Autowired
	private Environment env;
	
	public static void main(String[] args) {
		SpringApplication.run(IksanaDataGeneratorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CommonUtil.setMQTT_SERVER_CONNECTION_URL(env.getProperty("mqtt.connect.url"));
		
		
		System.err.println(CommonUtil.getMQTT_SERVER_CONNECTION_URL());
	}

}
