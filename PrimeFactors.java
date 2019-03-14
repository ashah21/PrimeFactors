package prime.factors;

public class PrimeFactors {
	
	public static void main(String[] args) {
		//Java requires an entry point to start. Put code in here to call generate()
		
		int n = 525;
		System.out.print(generate(n) + " " + n);
		//System.out.print(generate(5) + ": " );
		
	}
	
	public static Boolean isPrime(int n)
	{
		// takes an integer argument and returns a list<integer>
		// the list contains the prime factors in numerical sequence
		
		if(n < 2)
			return false;
		else if(n == 2)
			return true;
		else if(n%2 == 0)
			return false;
		for(int i =3; i *i <= n; i= i+2)
		{
			if(n%i ==0)
				return false;
		}
			
		return true;
		
	}
	
	public static int generate(int n)
	{
		int i = 2;
		 while( n >1)
		 {
			 if(n %i ==0)
			 {
				 System.out.print(i + " ");
				 n = n/i;
			 }
			 else
				 i++;
		 }
		
		return n;
		
	}

}
