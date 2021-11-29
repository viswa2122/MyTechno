class Triangle
{
  public static void main(String[] args)
  {
	int i,j,rows;
	rows=5;
	for(i=1;i<= rows;i++)
	{
		for(j= rows;j>=i;j--)
		{
		System.out.print(" ");
		}
			for(j=1;j<=i;j++)
			{
			System.out.print("* ");
			}
	System.out.println();
	}
  }
}