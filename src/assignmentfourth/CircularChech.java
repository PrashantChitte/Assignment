package assignmentfourth;

public class CircularChech 
{

	public static boolean checkCircularString(String PREDEFINESTR,String stringPass)
	{
		PREDEFINESTR=PREDEFINESTR+PREDEFINESTR;
		if(PREDEFINESTR.length()  < stringPass.length())
		{
			return false;			
		}
		else
		{
			
			return PREDEFINESTR.contains(stringPass);
		}
	}
}
