
 class simpleIntreste {
	double principal ;
	double rate;
	double time;
	
	public void setprincipal(double i)
	{
		principal = i;
		
	}
     public void setrate (double j)
     {
    	 rate  = j;
    	 
     }
     public void settime(double t)
     {
     time = t;
     
}
     public double  calculate()
     
     {
    	 double SI = (principal*rate*time)/100;
    	
		return SI;
     }
     
}

public class simpleIntrest {
	public static void main(String[] args){
	
	
	simpleIntreste a = new simpleIntreste();
	a.setprincipal(1000.123);
	a.setrate(15.5);
	a.settime(3);
	double RSI = a.calculate();
	 System.out.println("simple intrest is"+ "-------" +RSI);
	}
}

