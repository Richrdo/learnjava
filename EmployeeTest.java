import java.io.*;
public class EmployeeTest{
	public static void main(String []args){
		Employee empOne=new Employee("Tom");
		Employee emptwo=new Employee("Jerry");
		empOne.empAge(26);
		empOne.empDesignation("高级程序员");
		empOne.empSalary(200000);
		empOne.printEmployee();

		emptwo.empAge(21);
		emptwo.empDesignation("菜鸟程序员");
		emptwo.empSalary(2000);
		emptwo.printEmployee();
	}

}