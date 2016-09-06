package org.marian.springtutorial.dao;

import java.util.List;

import org.marian.springtutorial.beans.Department;

public interface BaseDao {
	public List<Department> queryDepartment() throws Exception;
	public void addDepartment(Department d);
}
