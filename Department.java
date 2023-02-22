package week5.day1;

public class Department extends College {
	public void deptName()
	{
		System.out.println("IT");
	}
	public void deptHod()
	{
		System.out.println("Menaka");
	}
	
	public static void main(String[] args) {
		
		Department IT=new Department();
		IT.deptName();
		IT.deptHod();
	}

}
