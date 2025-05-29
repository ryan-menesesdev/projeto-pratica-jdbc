package application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		// Implementação de DAOs (Data Acess Objects)
		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		// Aplicação de SellerDao
		
		Seller selOut = sellerDao.findById(3);
		
		Department dep = new Department();
		dep.setId(1);
		List<Seller> sellerDaosByDepartment = sellerDao.findByDepartment(dep);
		List<Seller> sellerDaos = sellerDao.findAll();
		
		sellerDaosByDepartment.forEach(System.out::println);
		System.out.println("==================================");
		sellerDaos.forEach(System.out::println);
		
		// sellerDao.insert(new Seller(null, "Bob James", "bobjames@gmail.com", LocalDate.parse("2000-05-31"), 4000.0, dep));
		selOut = sellerDao.findById(5);
		selOut.setName("OiMeu NomeÉ Ryan");
		sellerDao.update(selOut);
		
		System.out.println("Updated.");
		
		selOut = sellerDao.findById(1);
		
		/*sellerDao.deleteById(selOut);
		System.out.println("Deleted");*/
		
		// Aplicação de DepartmentDao
		// Listagem de todos os departamentos cadastrados -> listAll()
		
		List<Department> listAllDepartments = departmentDao.findAll();
		
		listAllDepartments.forEach(System.out::println);
		
		Department d = departmentDao.findById(1);
		
		System.out.println(d);
	}
}
