
public class OpenApp {

	public static void main(String[] args) 
	{
		Runtime rt = Runtime.getRuntime();
		try 
		{
			rt.exec("calc.exe");
		}
		catch(Exception e)
		{
			
		}
		
	}

}
