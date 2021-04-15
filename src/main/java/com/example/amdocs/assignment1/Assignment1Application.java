package com.example.amdocs.assignment1;

import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonGeneratorFactory;
import javax.json.stream.JsonParser;
import java.util.List;
import java.util.ArrayList;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment1Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
		
		
		readMethodJson();
	}
	
	public static void readMethodJson()
	{
		
		JsonParser parser=Json.createParser(Assignment1Application.class.getResourceAsStream("/jsons.json"));
		
		while(parser.hasNext())
		{
			JsonParser.Event event= parser.next();
			System.out.println(event.toString());
			
//			 switch (event) {
//             case KEY_NAME:
//             case VALUE_STRING:
//             case VALUE_NUMBER:
//                 System.out.print(": " + parser.getString());
//                 break;
//             case VALUE_NULL:
//                 System.out.print(": null");
//                 break;
//             case VALUE_TRUE:
//                 System.out.print(": true");
//                 break;
//             case VALUE_FALSE:
//                 System.out.print(": false");
//         }

         System.out.println();
		}
		
	}
	

}
