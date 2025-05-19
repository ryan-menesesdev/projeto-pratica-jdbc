package application;

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
		List<Seller> sellers = seller.findByDepartment(dep);
		
		for(Seller s : sellers) {
			System.out.println(s);	
		}
		
	}
}
