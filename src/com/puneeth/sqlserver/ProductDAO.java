package com.puneeth.sqlserver;

import java.sql.SQLException;
import java.util.List;

public interface ProductDAO {
	void persist(ProductPOJO p);
	void persist(List<ProductPOJO> ps);
	List<ProductPOJO> fetch();
}
