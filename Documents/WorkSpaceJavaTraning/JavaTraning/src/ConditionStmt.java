
 class ConditionStmt1 {
	
	
	public void division (double j)
	{
		double div =j;
		
		if ((div % 10) == 0) 
		{
			System.out.println("the number is divisible by 10");
		}
		else if ((div % 9) == 0 )
		{
			System.out.println("the number is divisible by 9");
		}
		else if ((div % 7) == 0)
		{
			System.out.println("the number is divisible by 7");
		}
		else 
		{
		System.out.println(" the number  not divisible by 10 , 9 ,7 --- "+ div);
		}
			
	}
	public void oddnumber()
	{
		System.out.println("the odd numbers are " );
		for (int i =0;i < 50 ; i++)
		{
			if ((i % 2)== 0)
			{
				
			}
			else
			{
			
				System.out.println(+i);
			}
		}
	}
	public void oddnumberwhile()
	{
		int i = 0;
		System.out.println("the odd numbers are " );
		while (i < 50){
			if ((i % 2)!= 0)
							
				System.out.println(+i);
			
			i = i+1;
		}
			
	}

}

 public class ConditionStmt {
	 public static void main(String[] args){
		 
		 ConditionStmt1 d = new ConditionStmt1();
		// d.division(100);
		 ConditionStmt1 o = new ConditionStmt1();
		 //o.oddnumber();
		 o.oddnumberwhile();
	 }
 }