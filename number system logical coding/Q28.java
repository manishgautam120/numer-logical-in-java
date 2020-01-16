//28. Develop a program to print prime numbers 
//    in the reverse order from 70 to 20?

class Q28
{
	public static void main(String[] args) 
	{
		boolean isPrime = true;
		for(int i = 70; i >= 20; i--)
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
