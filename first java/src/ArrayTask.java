import java.util.Arrays;

public class ArrayTask {

	public static void main(String[] args) 
	{
		int scores[] = new int[] {12,19,0,120,45,99,100,44,0,99};
		
		//print all scores
		for(int y:scores)
			System.out.println(y);
		
		//total scores
		float total = 0;
		for(int y:scores)
			total = total+y;
		System.out.println("Total Scores="+total);
		
		//average score
		System.out.println("Avg.Scores="+total/scores.length);
		  
		//highest score
		int max = scores[0];
		for(int y:scores)
		{
			if(max<y)
				max=y;
		}
		System.out.println("Highest Score="+max);
		
		//lowest score	
		int min = scores[0];
		for(int y:scores)
		{
			if(min>y)
				min=y;
		}
		System.out.println("Lowest Score="+min);
		
		//no. of century,half century,zero
		int century=0,hc=0,zero=0;
		for(int y:scores)
		{
			if(y>=100)
				century++;
			if(y>=50 & y<100)
				hc++;
			if(y==0)
				zero++;
		}
		System.out.println("Century="+century);
		System.out.println("Half Century="+hc);
		System.out.println("Zero="+zero);
	
		/*//highest score index
		for(int=0;i<scores.length;i++) {
			if(scores[i]==max) {
				System.out.println("highest score ="+i);//error i cannot be resolved
				break;
			}
		}*/
		//sorting
		Arrays.sort(scores);
		for(int y:scores)
			System.out.println(y);
	}

}
