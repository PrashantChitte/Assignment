package assignmentfirst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReversString {

	public static String doReverseFirst(String str)
	{
		char arr[]=str.toCharArray();
		int len=str.length();
		char temp[]=new char[len];
		String strtemp="";
		int j=0;
		for(int i=len-1;i>=0;i--)
		{
			temp[j]=str.charAt(i);
			j++;
		}
		for(int i=0;i<len;i++)
		{
			strtemp+=temp[i];
		}
		return strtemp;
		
	}
	public static String doReverseSecond(String str)
	{
		String str2 = "";		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			str2+=str.charAt(i);
			
		}
		return str2;
		
	}
	public static String doReverseThird(String str)
	{
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
