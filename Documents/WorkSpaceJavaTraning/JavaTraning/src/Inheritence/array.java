package Inheritence;

 class array1 {
	
	int [] a = new int[50];
	
	private void oddnumbers()
	{
		int i;
		int j=0;
		for(i=0;i <= 100; i++)
		{
			if (i  % 2  != 0)
			{
				a[j] = i;
				j++;
			}
		}
		
	}
    public void printoddnumbers()
    {
    	int i;
    	System.out.println("odd numbers are");
		for(i=0;i < 50; i++)
		{
			oddnumbers();
			System.out.println(a[i]);
		}
    	
    }
}
 
 public class array{
	 
	 public static void main(String[] args)
	 {
		 array1 a =  new array1();
		 //a.oddnumbers();
		 a.printoddnumbers();
		 
	 }
 }