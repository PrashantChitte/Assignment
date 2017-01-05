package testall;

import assignmentfirst.RecursiveReverseString;
import assignmentsecond.RecursiveReverseInteger;
import assignmentsecond.ReverseInteger;

public class IntegerReverseTest {

	public static void main(String[] args) 
	{
		int value=12345678;
		ReverseInteger.doreverseFirst(value);//by mod method
		ReverseInteger.doreverseSecond(value);//by converting value to string
		System.out.println("Reverse 3:"+ReverseInteger.doReverseThird(value));//by using collection.reverse
		System.out.println("Recursive Reverse:"+RecursiveReverseInteger.doRecursiveReverseInteger(value));
	}

}
