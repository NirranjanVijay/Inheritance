package week5.day1;

public class Student1 {
	  public void getStudentInfo(int id)
	     {
	    	 System.out.println("Student id : "+id);
	     }
	     public void getStudentInfo(int id,String Name)
	     {
	    	 System.out.println("Student id : "+id+"\n"+"Student name : "+Name);
	     }
	     public void getStudentInfo(String Name,String email, long mobno)
	     {
	    	 System.out.println("Student name : "+Name+"\n"+"Student email : "+email+"\n" +"Student mobno-"+mobno);
	     }
	     public static void main(String[] args) {
	    	 
	    	 Student1 info=new Student1();
	    	 info.getStudentInfo(20);
	    	 info.getStudentInfo(20,"Nirranjan Vijay.P");
	    	 info.getStudentInfo("Nirranjan Vijay.P","p.nirranjanvj@gmail.com",822070073);
}
}