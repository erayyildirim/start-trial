package factory1;

public class Manager extends Employee {
	protected String departmentManaged;
	
	public static final int MANAGEMENT_PAYMENT = 3000;
	
	public Manager(int no, String name, int year, String department,String departmentManaged){
		super(no, name, year, department);
		this.departmentManaged = departmentManaged;
	}

}
