package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department insert ===");
		// Department department = new Department(6, "Dance");
		// departmentDao.insert(department);
		
		System.out.println("=== TEST 2: department update ===");
		// departmentDao.update(department);
		
		System.out.println("=== TEST 3: department deleteById ===");
		// departmentDao.deleteById(6);
		
		System.out.println("=== TEST 4: department deleteById ===");
		//Department department = departmentDao.findById(3);
		//System.out.println(department);
		
		System.out.println("=== TEST 5: department deleteById ===");
		List<Department> departments = departmentDao.findAll();
		for (Department department : departments) {
			System.out.println(department);
		}
	}

}
