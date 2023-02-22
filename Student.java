package week5.day1;

public class Student extends Department{
	public void studentName()
	{
		System.out.println("Nirranjan Vijay.P");
	}
	public void studentId()
	{
		System.out.println("311418205020");
	}
	public void studentbranch()
	{
		System.out.println("B.tech");
	}

	public static void main(String[] args) {
		
		Student MCE=new Student();
		MCE.collegeName();
		MCE.collegeCode();
		MCE.collegerank();
		MCE.deptName();
		MCE.deptHod();
		MCE.studentName();
		MCE.studentId();
		MCE.studentbranch();
	}

}
