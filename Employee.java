package com.myFirstclass;
public class Employee {
	    private int id;
	    private String name;
	    private String department;
	    private double salary;
	    public Employee(int id, String name, String department, double salary) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public double getSalary() {
	        return salary;
	    }

	   
	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	   
	    public void displayEmployee() {
	        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: $" + salary);
	    }
	}



