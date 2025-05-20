package application;

import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		SellerDao seller = DaoFactory.createSellerDao();
		
		Seller selOut = seller.findById(3);
		
		Department dep = new Department();
		dep.setId(1);
		List<Seller> sellersByDepartment = seller.findByDepartment(dep);
		List<Seller> sellers = seller.findAll();
		
		sellersByDepartment.forEach(System.out::println);
		System.out.println("==================================");
		sellers.forEach(System.out::println);
		
		// seller.insert(new Seller(null, "Bob James", "bobjames@gmail.com", LocalDate.parse("2000-05-31"), 4000.0, dep));
		selOut = seller.findById(5);
		selOut.setName("OiMeu NomeÉ Ryan");
		seller.update(selOut);
		
		System.out.println("Updated.");
	}
}
