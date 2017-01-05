package assignmentthird;

public class ThirdLarget 
{

	public static void findThirdLargets(int[] arr)
	{
		int maxOne = 0;
        int maxTwo = 0;
        int maxThree=0;
        int maxFoure=0;
        for(int n:arr){
            if(maxOne < n)
            {
            	maxThree =maxTwo;
            	maxTwo = maxOne;
                maxOne =n;
            }
            else if(maxTwo < n)
            {
                maxTwo = n;
            }
            else if(maxThree < n)
            {
            	maxThree = n;
            }            
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
        System.out.println("Third Max Number: "+maxThree);
       
	}
}
