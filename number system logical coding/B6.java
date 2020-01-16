//print all divisibles of 5 from 1 to 500
class B6
{
	public static void main(String[] args) 
	{
		for(int i = 1; i <= 500; i++)
		{
			if(i % 5 == 0)
			{
				System.out.print(i + ",");
			}
		}
	}
}
