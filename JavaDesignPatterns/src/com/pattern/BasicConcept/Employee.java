package com.pattern.BasicConcept;

//Consider this class as table and each object with all fields like records
//Check least required data to be in a recored i.e name and id make them as 
//constructor fields
//Check for frequently changed fields make them as getter setter methods
public class Employee {

	
	private String empname;
	private  int empID;
	private double salary;
	private String grade;
	private String company = "IBM";
	
	//Here email interface should also be implemented so we use this in constructor
	private Email email;
	
	public void notifyEmail(){
		System.out.println(email.sendMail());
	}
	
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}



	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}



	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}



	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}



	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}



	
	public Employee(String empname, int empID,Email email) {
		super();
		this.empname = empname;
		this.empID = empID;
		this.email=email;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [" + (empname != null ? "empname=" + empname + ", " : "") + "empID=" + empID + ", salary="
				+ salary + ", " + (grade != null ? "grade=" + grade + ", " : "")
				+ (company != null ? "company=" + company : "") + "]";
	}
	
	
	
}
