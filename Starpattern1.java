
public class Starpattern1
{
	public static void main(String[] args)
	{
		int i,j,n=7;
		System.out.println("right angle triangle pattern of star is");
		for(i=1;i<n;i++)
		{
			for (j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println(" ");
		}
	}	
}