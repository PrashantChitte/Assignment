package assignmentsecond;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseInteger
{
	public static void doreverseFirst(int value)
	{ 	//1234
		int res=0,mod=0;
		while(value!=0)
		{
			mod=value%10;
			res=res*10+mod;
			value=value/10;
		}
		System.out.println("Reverse 1:"+res);		
	}
	public static void doreverseSecond(int value)
	{
		String str =""+value;
		String str2="";
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			str2+=str.charAt(i);
			
		}
		System.out.println("Reverse 2:"+str2);		
	}
	public static String doReverseThird(int value)
	{
		String str=""+value;
		char ch[]=str.toCharArray();
		List l=new ArrayList();
		for(int i=0;i<str.length();i++)
		{
			l.add(ch[i]);
		}
		Collections.reverse(l);
		String s="";
		ListIterator ltr=l.listIterator();
		while(ltr.hasNext())
		{
			 s+=(char) ltr.next();
			
		}
		return s;
		
	}
	
	
}
