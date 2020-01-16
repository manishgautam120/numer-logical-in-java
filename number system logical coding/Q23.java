//23. Develop a program to print prime numbers between 50 and 100?
class Q23
{
	public static void main(String[] args) 
	{
		boolean isPrime = true;
		for(int i = 50; i <= 100; i++)
		{
			for(int j = 2; j <= (i / 2); j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i + ", ");
			}
			isPrime = true;
		}
	}
}
