package Exception;

 class Expectionc1 {
	 
	 int i;
	 
	 private  void throws1 (int i) throws Exception {
		 
		 if (i > 10)
			 
		 {
			 throw new Exception ("rangeoutof boundary");
		 }
		 else if  (i < 0)
		 {
			 throw new Exception ("less than 0");
		 }
	 }

	
	public void throws2 (int j)throws Exception	 {
		try{
		throws1(j);
		
		} catch (Exception e)
		{
			
			throw e;
		}
		finally {
			
			
			System.out.println("Finally executed");
		}
	
	}


}
 
 public class Expectionhand {
	 
	 public static void main(String[] args)  {
		 Expectionc1 ex = new Expectionc1();
		 
		 
		 try {
			ex.throws2(11);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("please enter the number from 1 - 10");
			 try {
					ex.throws2(-1);
				} catch (Exception ee) {
					// TODO Auto-generated catch block
					System.out.println("please enter the number from 1 - 10");
				}
		}
		
		 
	}
	 
	 
	 
 }
 
