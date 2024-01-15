package lessons;

public class Methods {

	static String lol = "12";
	
	public static void main(String[] args) {
		
		smth();
	}
	
	public static void smth() 
	{
		lol = (Integer.parseInt(lol) + 2 +"");
		System.out.println(lol);
	}

}
