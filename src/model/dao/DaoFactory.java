package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	public static SellerDao cratedSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createdDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
