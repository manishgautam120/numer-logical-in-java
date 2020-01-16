//10. Find out sum of all even numbers between two given numbers?
class Q10
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
		int sum = 0;
		for(int k = i; k <= j; k++)
		{
			if(k % 2 == 0)
			{
				sum += k;
			}
		}
		System.out.print(sum);

	}
}
