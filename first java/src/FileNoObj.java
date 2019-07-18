import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileNoObj
	{
	public static void main(String[] args) {
		try(FileReader fr=new FileReader("E:\\core\\demoInput.csv");
			BufferedReader br=new BufferedReader(fr))
		{
			String x;
			while( (x=br.readLine())!=null)
			{
				System.out.println(x);
				int i=0,j=0;
				String f[]=x.split(",");
				System.out.println(f[3]);
				int price=Integer.parseInt(f[3]);
				if(f[2].equalsIgnoreCase("india"))
				{
					i=price*5/100;
					j=price+i;
				}
				else if(f[2].equalsIgnoreCase("america"))
				{
					i=price*6/100;
					j=price+i;
				}
				else if(f[2].equalsIgnoreCase("china"))
				{
					i=price*4/100;
					j=price+i;
				}
				else if(f[2].equalsIgnoreCase("korea"))
				{
					i=price*2/100;
					j=price+i;
				}
				try(FileWriter fw =new FileWriter("E:\\core\\demooutput.csv",true);
					BufferedWriter bw=new BufferedWriter(fw))
				{
					bw.write(x+","+i+","+j+"\n");
					bw.flush();
					
				}
				catch(IOException e)
				{
					System.out.println(e);
				}
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}