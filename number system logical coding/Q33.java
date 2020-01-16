// 33. Develop a program to print numbers which should come 
// after 3 non prime numbers. Develop between 10 to 100

class Q33
{
	public static void main(String[] args) 
	{
		boolean isPrime = true;
		int nonPrimeCount = 0;
		for(int i = 10; i <= 100; i++)
		{
			for(int j = 2; j <= (i / 2); j++)
			{
				if(i % j == 0)
				{
					nonPrimeCount ++;
					isPrime = false;
					break;
				}
			}
			if(nonPrimeCount == 3)
			{
				System.out.print((i + 1) + ", ");
				nonPrimeCount = 0;
			}
			if(isPrime)
			{
				nonPrimeCount = 0;
			}
			isPrime = true;
		}
	}
}
