class B13
{
	public static void main(String[] args) 
	{
		int i = 1234;
		int j = i % 10;
		i = i / 10;
		int k = i % 10;
		i = i / 10;
		int l = i % 10;
		i = i / 10;
		int m = i % 10;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
	}
}
