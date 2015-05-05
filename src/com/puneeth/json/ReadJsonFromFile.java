package com.puneeth.json;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class ReadJsonFromFile {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		//Read from the filesystem
		Map<String, Object> inmap = mapper.readValue(
				new File("C:\\Users\\puneeth.narayana\\Desktop\\MSViz\\Training\\example.json"),
				new TypeReference<Map<String,Object>>() {
				});

		System.out.println(inmap.get("Name"));
		System.out.println(inmap.get("Age"));
		
		@SuppressWarnings("unchecked")
		ArrayList<String> list  = (ArrayList<String>) inmap.get("message");
		
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println();
	}
}
