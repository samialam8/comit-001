package com.comit.course._02_Practice;

/*
 * Example done with getter and setter method
 * 
 * Calculate the salary increase for a group of employees of a company considering the following criteria: 
 * If the salary is less than $ 1,000.00: Increase 15% If the salary is greater than or equal to $ 1,000.00: Increase 12% 
 * The program must do The following: - Save the new salaries in the arrangement - 
 * Calculate the payroll - Print the salaries from the settlement
 */

class Employee {
	/*
	 * Attributes
	 */
	String groupOfEmployee;
	double salary;
	
	/* getter and setter Method */
	
	String getGroupOfEmployee() {
		return groupOfEmployee;
	}
	void setGroupOfEmployee(String groupOfEmployee) {
		this.groupOfEmployee = groupOfEmployee;
	}

	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}

	/*
	 * Method
	 */
	void display() {
		System.out.println("Employee Status");
		System.out.println(groupOfEmployee);
		System.out.println("Current Salary");
		System.out.println(salary);
	}
	
	double baseOnSalary(double percentage) {
		if (salary < 1000) {
			double insalary = (salary * percentage)/100;
			System.out.println("The value after 15% will be "+ insalary);
			salary = salary + (salary * percentage)/100;
		} else {
			double insalary = (salary * percentage)/100;
			System.out.println("The value after 12% will be "+ insalary);
			salary = salary + (salary * percentage)/100;
		}
	        return salary;
		
	}
	
	
}

public class TwentyFive {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();

		emp1.setGroupOfEmployee("John");
		emp1.setSalary(1002);
		
		
		emp1.display();
		//double lIncrement = emp1.baseOnSalary(15);
		double hIncrement = emp1.baseOnSalary(12);
		//System.out.println("Increased salary by 15 percentage: "+ lIncrement);
		System.out.println("Increased salary by 12 percentage: "+ hIncrement);
		
	}

}
