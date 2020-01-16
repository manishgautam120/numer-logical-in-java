//14. Find out total digits of a given number?
class Q14
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("enter 1 cla");
			return;
		}
		int num1 = Integer.parseInt(args[0]);
		int i = num1, count = 0;
		while(i != 0)
		{
			count ++;
			i = i / 10;
		}
		System.out.println("digits count in " + num1 + ":" + count);
	}
}
