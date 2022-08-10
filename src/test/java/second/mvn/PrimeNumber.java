package second.mvn;

public class PrimeNumber {
	public boolean checkprime(int n)
	{
		if(n==0||n==1)
		{
			return false;
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
		}
		
	}
	public static void main(String[] args) {
		
	}

}
