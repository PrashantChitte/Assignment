package testall;

import assignmentfourth.CircularChech;

public class CircularStringTest {

	public static void main(String[] args) 
	{
		
		String PREDEFINESTR="love@java";
		String stringPass="@javalove";
		System.out.println("Circular Substring:"+CircularChech.checkCircularString(PREDEFINESTR, stringPass));
	}

}
