//2. Print smaller number from 3 given numbers
class Q2
{
	public static void main(String[] args) 
	{
		if(args.length < 3)
		{
			System.out.println("pls supply 3 cla");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		int min = i < j ? (i < k ? i : k) : (j < k ? j : k);
		System.out.println("smaller number:" + min);
	}
}
