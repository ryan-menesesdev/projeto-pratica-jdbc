package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	public void insert(Department seller);
	public void update(Department seller);
	public void deleteById(Department seller);
	public Department findById(Integer id);
	public List<Department> findAll();
}
