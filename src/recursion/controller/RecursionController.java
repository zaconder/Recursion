package recursion.controller;

public class RecursionController
{
	
	
	public void start()
	{
		for(int spot = 0; spot < 100; spot++)
		{
			long startTime = System.currentTimeMillis();
			System.out.println("The " + spot +"'the position of the Fibonacci sequence is: "
								+ getFibonacci(spot) + ". It took " + (System.currentTimeMillis()-startTime)/1000
								+" seconds to calculate it.");
		}
		
//		for(int spot = 0; spot < 100; spot++)
//		{
//			long startTime = System.currentTimeMillis();
//			System.out.println("The " + spot +"'the position of the Factorial sequence is: "
//								+ getFactorial(spot) + ". It took " + (System.currentTimeMillis()-startTime)/1000
//								+" seconds to calculate it.");
//		}
//		
//		for(int spot = 0; spot < 10; spot++)
//		{
//			long startTime = System.currentTimeMillis();
//			System.out.println("The " + spot +"'the position of the Factorial sequence is: "
//								+ getFacLoops(spot) + ". It took " + (System.currentTimeMillis()-startTime)/1000
//								+" seconds to calculate it.");
//		}
//		
//		for(int spot = 0; spot < 10; spot++)
//		{
//			long startTime = System.currentTimeMillis();
//			System.out.println("The " + spot +"'the position of the Fibonacci sequence is: "
//								+ getFibLoops(spot) + ". It took " + (System.currentTimeMillis()-startTime)/1000
//								+" seconds to calculate it.");
//		}
//		
	}
	
	private long getFibonacci(int position)
	{
		if(position == 0 || position == 1 )
		{
			return 1;
		}
		else
		{
			return getFibonacci(position - 2) + getFibonacci(position - 1);
		}
	}
	
	
	private long getFactorial(int value)
	{
		if (value == 0 || value == 1)
		{
			return 1;
		}
		else
		{
			return value * getFactorial(value -1);
		}
	}
	
	public int getFibLoops(int value)
	{
		while (value > 1)
		{
			return getFibLoops(value - 2 ) + getFibLoops (value - 1);
		}
		return value;
	}
	
	public int getFacLoops(int value)
	{
		while (value > 1)
		{
			return value * getFacLoops(value -1);
		}
		return value;
	}
	
}
