//3. Print middle number from 3 given numbers.
class Q3
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
		int middle = 0;
		int min = i < j ? (i < k ? i : k) : (j < k ? j : k);
		int max = i > j ? (i > k ? i : k) : (j > k ? j : k);
		if(!(i == min || i == max))
		{
			middle = i;
		}
		if(!(j == min || j == max))
		{
			middle = j;
		}
		if(!(k == min || k == max))
		{
			middle = k;
		}
		System.out.println("middle number:" + middle);
	}
}
