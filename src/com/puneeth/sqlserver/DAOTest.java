package com.puneeth.sqlserver;

import java.util.List;

public class DAOTest {
public static void main(String[] args) {
	ProductDAOImpl pdi = new ProductDAOImpl();
	ProductPOJO p = new ProductPOJO(50,"Suffix Trees");
	ProductPOJO p1 = new ProductPOJO(100,"VC++");
	
	pdi.persist(p);
	pdi.persist(p1);
	
	List<ProductPOJO> prods;
	prods = pdi.fetch();
	
	for (ProductPOJO product : prods) {
		System.out.println("Product ID: "+ product.getProductID() +" with Name: "+product.getProductName()+" and Quantity: "+product.getQuantity());
	}
}
}
