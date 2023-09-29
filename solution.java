class Solution {
    public int minSteps(int n) {
      if(n==1)
      {
        return 0;
      } 
      else if(isprime(n))
      {
        return n;
      }
      else{
        int j =2;
        int num =0;
        while(n>1)
        {
           if(isprime(j) && n%j==0)
           {
             n = n/j;
             num = num+j;
            // System.out.println(num);
             
           }
           else{
             j++;
           }
        }
        return num;
      }
    }
    static boolean isprime(int n)
    {
      if(n<=1)
      {
        return false;
      }
      else if(n<=3)
      {
        return true;
      }
      else if(n%2==0 || n%3==0)
      {
        return false;
      }
      int i=5;
      for(i=5;i*i<=n;i=i+6)
      {
        if(n%i==0 || n%(i+2)==0)
        {
          return false;
        }
      }
      return true;
    }
}
