package model.dao;

import model.dao.JDBC.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
		
	}

}
