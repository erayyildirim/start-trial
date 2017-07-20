package Inheritance;

public class CommissionEmployeeTest {
	public static void main(String [] args){
	
	CommissionEmployee employee = new CommissionEmployee("Eray","Yıldırım","147528-33" , 3000, .03);
	
	System.out.println("Employe Information");
	System.out.println();
	System.out.println("First name is " + employee.getFirstName());
	System.out.println("Last name is " + employee.getLastName());
	System.out.println("Social Security number is  " + employee.getSocialSecurityNumber());
	System.out.println("Gross sales is " + employee.getGrossSales());
	System.out.println("Commission rate " + employee.getCommissionRate());
	
	employee.setGrossSales(5000);
	employee.setCommissionRate(.1);
	System.out.println();
	
	System.out.println("Updated");
	System.out.printf("%n%s:%n%n%s%n", "Updated employee information", employee);
	}
}
