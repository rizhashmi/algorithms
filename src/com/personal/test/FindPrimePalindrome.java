package com.personal.test;

public class FindPrimePalindrome {
    public static int primePalindrome(int N) {
        
    	
        for (;;) {
        	if (N == reverse(N) && isPrime(N)) {
        		return N;
        	}
        	N ++;
        	
            if ( N > 10_000_000 && N < 100_000_000)
                N = 100_000_000;	
        }
      }
	
    public static boolean isPrime(int N) {
    	if (N< 2 ) return false;
    	for (int i= 2 ;i*i <= N; i ++) {
    		if (N%i ==0) return false;    
    	}
    	return true;
    }
    
    public static int reverse(int N) {
    	int reverseNumber = 0;
    	
    	while (N!=0) {
    		reverseNumber = reverseNumber* 10 +  N % 10;
    		N /=10;
    	}
    	
    	return reverseNumber;
    	
    }
	public static void main(String args[]) {
		int N = 700;
		int count = 0;
		long x = System.currentTimeMillis();
		while (N <=1000) {
			int p = primePalindrome(N);
			System.out.println(p + " " + count ++);
			
			//if (N == p) return; 
				
			N = p+1;
		}
		System.out.println(System.currentTimeMillis() - x);
	}
	
	public static int primePalindrome1(int N) {
        if(N<=10)
        {
            for(int i=N;i<=11;i++)
            {
                if(isPrime(i))
                    return i;
            }
        }
        int d=0;
        int t=N;
        while(t!=0)
        {
            t/=10;
            d++;
        }
        int k = (d+1)/2;
        int start = N/(int)Math.pow(10,d-k);
        for(int i = start;i<=19999;i++)
        {
            int tmp =buildPalindrome1(i);
            if(tmp>=N&&isPrime(tmp))
                return tmp;
        }
          throw null;  
    }
    public  static boolean isPrime1(int N)
    {
        if(N<2) return false;
        int R = (int) Math.sqrt(N);
        for(int i=2;i<=R;i++)
        {
            if(N%i==0)  return false;
        }
        return true;
    }
    public  static  int buildPalindrome1(int n)
    {
        if(n<10)
            return n*10+n;
        int tmp=n;
        int rev=0;
        int t=0;
        int l=0;
        tmp/=10;
        while(tmp!=0)
        {
            t=tmp%10;
            tmp/=10;
            rev= rev*10+t;
            l++;
        }
        return rev+n*(int)Math.pow(10,l);
    }
}
