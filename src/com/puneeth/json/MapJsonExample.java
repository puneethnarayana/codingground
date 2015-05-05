package com.puneeth.json;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

public class MapJsonExample {
public static void main(String[] args) {
	try {
		ObjectMapper obm = new ObjectMapper();
		String json="";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Name", "Curry");
		map.put("Age", "26");
		
		List<Object> list = new ArrayList<Object>();
		list.add("Golden State Warriors");
		list.add("Will be Winning");
		list.add("The MVP");
		
		
		map.put("message", list);
		
		//json = obm.writeValueAsString(map);
		
		try {
			obm.writeValue(new File("C:\\Users\\puneeth.narayana\\Desktop\\MSViz\\Training\\example.json"), map);
		} catch (Exception e) {
		}
		
		System.out.println(json);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
