package com;

import java.util.Objects;

public class Employee {

	int EmpId;
	String EmpName;
	int EmpSal;
	public Employee(int empId, String empName, int empSal) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpSal = empSal;
	}
	@Override
	public String toString() {
		return "Employee []";
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(int empSal) {
		EmpSal = empSal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(EmpId, EmpName, EmpSal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return EmpId == other.EmpId && Objects.equals(EmpName, other.EmpName) && EmpSal == other.EmpSal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
