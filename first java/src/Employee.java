public class Employee 
{
	int eid;
	String ename,city;
	double salary;
	void setEmployee()
	{
		eid=101;ename="Alex";salary=12000.00;city="Indore";
	}
	void setEmployee(int a, String b, double c, String d)
	{
	}
	
	void getEmployee()
	{
		System.out.println("eid="+eid+"ename="+ename+"salary="+salary+"city="+city);
	}
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setEmployee();
		e1.getEmployee();
		e2.setEmployee(102,"Amit",15000.00,"Mumbai");
		e2.getEmployee();
	}

}
