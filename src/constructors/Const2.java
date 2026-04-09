package constructors;

public class Const2 {
	public static void main(String[] args) {
		Const1 obj=new Const1(36, "Rohit", "Junior Devoloper",  50000.0, 5);
		System.out.println("------------Before Promotion--------------------");
		System.out.println("Employee Id : "+obj.getempid());
		System.out.println("Employee Name : "+obj.getempname());
		System.out.println("Employee desgination : "+obj.getempdesg());
		System.out.println("Employee Salary : "+obj.getempsalary());
		System.out.println("Employee Rating : "+obj.getperformancerating());
		System.out.println("------------AFTER PROMOTION--------------");
		obj.promoteengineer("Senior Developer");
		
	}
	}

