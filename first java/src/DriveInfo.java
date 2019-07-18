import java.io.File;

public class DriveInfo {

	public static void main(String[] args) 
	{
		//get all drives information in the system
		File f[] = File.listRoots();
		for(File ff:f)
		System.out.println(ff);
		
		
		//get names of all the folder in the drive
		File f1 = new File("C:\\");
		String names[] = f1.list();
		for(String n:names)
		System.out.println(n);
		
	}

}
