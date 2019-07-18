public class GarbageCollector {

	public static void main(String[] args) 
	{
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory ="+rt.totalMemory());
		System.out.println("Free Memory ="+rt.freeMemory());
		
		int x[] = new int[1000000];
		for(int i=0;i<x.length;i++)
			x[i]=i+1;
		System.out.println("Free Memory Now ="+rt.freeMemory());
		
		for(int i=0;i<x.length;i++)
			x[i]=0;
		rt.gc();  /*garbage collector method called.*/
		
		System.out.println("Free Memory After GC ="+rt.freeMemory());
	}

}
