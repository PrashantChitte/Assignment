package assignmentsecond;

public class RecursiveReverseInteger 
{
	static int res=0,mod=0;
	public static int doRecursiveReverseInteger(int value)
	{							
			if(value!=0)
			{
				mod=value%10;
				res=res*10+mod;
				value=doRecursiveReverseInteger(value/10);
			}
			//System.out.println("Reverse 1:"+res);
			return res;		
		
		
	}
}
