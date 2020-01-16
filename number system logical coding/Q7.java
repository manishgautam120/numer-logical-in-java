//7. Find out given number is an even or odd?
class Q7
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("pls supply 1 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		boolean isOdd = (i % 2 == 0) ? false : true;		
		if(isOdd)
		{
			System.out.print(i + " is odd number");
		}
		else
		{
			System.out.print(i + " is not an odd number");
		}
	}
}
