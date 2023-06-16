package com.example.demo.department;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table
public class Department {
	@Id
	@SequenceGenerator(name = "department_sequence", sequenceName = "department_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_sequence")
	private Long department_id;
	private String department_name;
	private Long manager_id;
	//private List list_of_employees;
	
	public Department() {
	}
	
	public Department(String department_name, Long manager_id) {
		this.department_name = department_name;
		this.manager_id = manager_id;
		//this.list_of_employees = list_of_employees;
	}
	
	public Department(Long department_id, String department_name, Long manager_id) {
		this.department_id = department_id;
		this.department_name = department_name;
		this.manager_id = manager_id;
		//this.list_of_employees = list_of_employees;
	}

	public Long getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Long department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public Long getManager_id() {
		return manager_id;
	}

	public void setManager_id(Long manager_id) {
		this.manager_id = manager_id;
	}

//	public List getList_of_employees() {
//		return list_of_employees;
//	}
//
//	public void setList_of_employees(List list_of_employees) {
//		this.list_of_employees = list_of_employees;
//	}

	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", department_name=" + department_name + ", manager_id="
				+ manager_id + "]";
	}
}
