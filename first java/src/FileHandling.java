import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling
{
	void read(String filename)
	{
		try(FileReader fr=new FileReader("E:\\core\\DemoInput.csv");
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
					i=price*10/100;
					j=price+i;
				}
				else if(f[2].equalsIgnoreCase("america"))
				{
					i=price*12/100;
					j=price+i;
				}
				else if(f[2].equalsIgnoreCase("china"))
				{
					i=price*14/100;
					j=price+i;
				}
				else if(f[2].equalsIgnoreCase("korea"))
				{
					i=price*22/100;
					j=price+i;
				}
				write(x,i,j);	
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
	void write(String x,int i,int j)
	{
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
	public static void main(String[] args) {
		String bw ="E:\\core\\Demooutput.csv";
		FileHandling s=new FileHandling();
		s.read(bw);
		
	}
	
	

}
