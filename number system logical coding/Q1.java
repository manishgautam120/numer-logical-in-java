//1. Print bigger number from 2 given numbers.
class Q1 
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.out.println("pls supply 2 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int max = i < j ? j : i;
		System.out.println("bigger number:" + max);
	}
}
