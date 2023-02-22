package week5.day1;

public class Desktop extends Computer {
	public void desktopName()
	{
		System.out.println("My PC");
	}
	public void desktopcolour()
	{
		System.out.println("Black Plastic"
				+ "");
	}
	
	public static void main(String[] args) {
		
		Desktop AsusTUF =new Desktop();
		
		AsusTUF.desktopName();
		AsusTUF.desktopcolour();
		AsusTUF.computerName();
		AsusTUF.computerModel();
		
		

}
}
