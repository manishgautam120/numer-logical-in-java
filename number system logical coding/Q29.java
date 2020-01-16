//29. Develop a program to print prime numbers which 
//    are immediately after multiples of 10 and bellow 200

class Q29
{
	public static void main(String[] args) 
	{
		boolean isPrime = true;
		for(int i = 2; i <= 200; i++)
		{
			for(int j = 2; j <= (i / 2); j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime && ((i - 1) % 10 == 0))
			{
				System.out.print(i + ", ");
			}
			isPrime = true;
		}
	}
}
