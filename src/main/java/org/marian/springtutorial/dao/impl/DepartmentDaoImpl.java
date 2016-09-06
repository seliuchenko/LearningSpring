package org.marian.springtutorial.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.marian.springtutorial.beans.Department;
import org.marian.springtutorial.dao.BaseDao;


public class DepartmentDaoImpl implements BaseDao {

	private DataSource dataSource;
	
	public List<Department> queryDepartment() throws Exception {
		// TODO Auto-generated method stub
		Connection conn = dataSource.getConnection();
		Statement stmt = conn.createStatement();
		String query = "Select dept_id, dept_no, dept_name from DEPARTMENT";
		ResultSet rs = stmt.executeQuery(query);
		List<Department> list = new ArrayList<Department>();
		while(rs.next()){
			Integer deptId = rs.getInt("dept_id");
	          String deptNo = rs.getString("dept_no");
	          String deptName = rs.getString("dept_name");
	          Department dept = new Department(deptId, deptNo, deptName);
	          list.add(dept);
		}
		return list;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void addDepartment(Department d) {
		// TODO Auto-generated method stub
		try {
			Connection conn = dataSource.getConnection();
			String query = "insert into DEPARTMENT (DEPT_ID, DEPT_NAME, DEPT_NO) values (?, ?, ?);";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, d.getDeptId());
			ps.setString(2, d.getDeptName());
			ps.setString(3, d.getDeptNo());
			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
