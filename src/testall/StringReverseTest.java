package testall;

import assignmentfirst.RecursiveReverseString;
import assignmentfirst.ReversString;

public class StringReverseTest {

	public StringReverseTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String str="doog";
		System.out.println("String reverse 1:"+ReversString.doReverseFirst(str));//by using character array;
		System.out.println("String reverse 2:"+ReversString.doReverseSecond(str));//by Reversing loop and storing each element in string
		System.out.println("String reverse 3:"+ReversString.doReverseThird(str));//by using Collections.revers.
		System.out.println("Recursive Reverse:"+RecursiveReverseString.doRecursiveReverse(str));
	}

}
