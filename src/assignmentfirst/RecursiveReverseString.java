package assignmentfirst;

public class RecursiveReverseString 
{
	static String reverse="";
	public static String doRecursiveReverse(String str)
	{
		reverse+=""+reverse;
		if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)+doRecursiveReverse(str.substring(0,str.length()-1));
            return reverse;
        }

		
	}

}
