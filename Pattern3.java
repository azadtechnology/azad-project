
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=30;
      for(int i=0;i<n;i++)
      {
    	  for(int j=0;j<n;j++)
    	  {
    		if(i==n-1||i-j>=(n-1)/2||i+j>=n+(n-1)/2)
    		{
    			System.out.print("*");
    		}
    		else
    		{
    			System.out.print(" ");
    			
    		}
    	  }
    	  System.out.println();
      }
	}

}
