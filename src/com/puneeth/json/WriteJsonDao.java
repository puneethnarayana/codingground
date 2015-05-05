package com.puneeth.json;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.puneeth.sqlserver.*;

public class WriteJsonDao {
public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
	
	ProductPOJO p =new ProductPOJO();
	p.setProductID(1);
	p.setProductName("Logo Quiz");
	p.setQuantity(10);
	
//	ProductPOJO p1 =new ProductPOJO();
//	p1.setProductID(1);
//	p1.setProductName("Logo Quiz");
//	p1.setQuantity(10);
	
	Map<String, ProductPOJO> pmap = new HashMap<String,ProductPOJO>();
	pmap.put("Products", p);
	
	ObjectMapper omapper = new ObjectMapper();
	omapper.writeValue(new File("C:\\Users\\puneeth.narayana\\Desktop\\MSViz\\Training\\example_1.json"), pmap);
	
	ObjectMapper mapper = new ObjectMapper();
	
	Map<String, LinkedHashMap<String,Object>> inmap = mapper.readValue(
			new File("C:\\Users\\puneeth.narayana\\Desktop\\MSViz\\Training\\example_1.json"),
			new TypeReference<Map<String,Object>>() {
			});
	
	
	//ArrayList<Map<String, Object>> lhmp = inmap.get("Products");
	//ArrayList<Map<String,Object>> objs = inmap.get("Products");
		
	LinkedHashMap< String, Object> objs = inmap.get("Products");
	//for (LinkedHashMap<String, Object> map : objs) {
		System.out.println(objs.get("productID"));
		System.out.println(objs.get("productName"));
		System.out.println(objs.get("quantity"));
//	}
	
//	objs = new ProductPOJO();
//	System.out.println(objs);
//	ProductPOJO inP = new ProductPOJO();
//	inP.setProductID((Integer) map.get("productID"));
//	inP.setProductName((String) map.get("productName"));
//	inP.setQuantity((Integer) map.get("Quantity"));
//	
	//System.out.println(inP.getProductID()+"--"+inP.getProductName()+"---"+inP.getQuantity());
}
}
