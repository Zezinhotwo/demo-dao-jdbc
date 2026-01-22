package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao department = DaoFactory.createDepartmentDao();
		Department dep = new Department(5, "Software");

		System.out.println("==== TEST 1: Insert ====");
		department.insert(dep);
		System.out.println("Insert Success");

		System.out.println("==== TEST 2: Update ====");
		dep.setName("food");
		department.update(dep);
		System.out.println("Update Success");
		
		// FIND_ALL
		department.findAll().forEach(System.out::println);
		// END_FIND_ALL

		System.out.println("==== TEST 3: Delete ====");
		department.deletById(dep.getId());
		System.out.println("Delete Success");

		System.out.println("==== TEST 4: FindById ====");
		System.out.println("FindById Success: " + department.findById(1));

		System.out.println("==== TEST 5: findAll ====");
		department.findAll().forEach(System.out::println);
		System.out.println("findAll Success");

	}

}
