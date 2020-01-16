class B14 
{
	public static void main(String[] args) 
	{
		for(int i = 1234567; i != 0; i = i / 10)
		{
			System.out.print((i % 10) + ",");
		}
	}
}
