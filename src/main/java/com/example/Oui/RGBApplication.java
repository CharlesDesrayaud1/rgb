package com.example.Oui;

import com.example.Oui.DAO.Event.Event;
import com.example.Oui.DAO.Event.Mark;
import com.example.Oui.DAO.Event.MarkType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RGBApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(RGBApplication.class, args);
		//String jsonString = "{\"timer\":45,\"player\":\"Penaud\",\"fixture\":\"France\",\"team\":\"France-New-Zealand\",\"markType\":\"tri\",\"type\":\"mark\"}";

		//ObjectMapper objectMapper = new ObjectMapper();
		//Event mark = new Mark(0, "Penaud", "France", "France-New-Zealand", 45, MarkType.tri);
		//System.out.println(objectMapper.readValue(jsonString, Event.class).toString());
	}

}
