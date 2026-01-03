package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createdDepartmentDao();
		
		System.out.println("=====TEST 1: Department findById=====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("=====TEST 2: Department findAll=====");
		List<Department> list = departmentDao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("=====TEST 3: Department insert=====");
		Department newDepartment = new Department(null,"Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New Id: = " + newDepartment.getId());
		
		System.out.println("=====TEST 4: Department update=====");
		Department updateDep = departmentDao.findById(7);
		updateDep.setName("Games");
		departmentDao.update(updateDep);
		System.out.println("Update completed");
		
	}

}
