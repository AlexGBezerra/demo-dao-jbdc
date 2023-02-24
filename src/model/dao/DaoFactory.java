package model.dao;

import db.DB;
import model.dao.JDBC.DepartmentDaoJDBC;
import model.dao.JDBC.SellerDaoJDBC;


public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}