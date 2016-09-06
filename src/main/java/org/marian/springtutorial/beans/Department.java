package org.marian.springtutorial.beans;

public class Department {

	private Integer deptId;
	private String deptNo;
	private String deptName;
	public Department(){}
	public Department(Integer deptId, String deptNo, String deptName){
		this.deptId = deptId;
		this.deptNo = deptNo;
		this.deptName = deptName;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
