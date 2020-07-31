package LabSession;

public class Employee {
	
	int Empnum;
	String name;
	String Address;
	String dob;
	String Hiredate;
	
	Employee ()
	{
		Empnum = 0;
		name = null;
		Address = null;
		dob = null;
		Hiredate = null;
		
	}
	Employee (int empnum,String name1 ,String Add , String dob1, String Hiredate1)
	{
		Empnum = empnum;
		name = name1;
		Address = Add;
		dob = dob1;
		Hiredate = Hiredate1;
	}
		
		public void DisplayEmp()
		{
			System.out.println("Employee NAme " + name);
			System.out.println("Employee empno " + Empnum);
			System.out.println("Employee address " + Address);
			System.out.println("Employee date of birth " + dob);
			System.out.println("Employee Hiredate " + Hiredate);
			
		}
		
		
		
		
	
	
	public void changeAddress(String newadd){
		
		Address = newadd; 
		System.out.println("Chnaged Address ----"+Address);
		
	}


}

 class Wagers  extends Employee{
	 int daysworked;
	 double salperday;
	 
	 Wagers (int days,double salperday1,int Empnum,String name ,String Address,String dob,String Hiredate)
 
	 {
		 super(Empnum,name ,Address,dob,Hiredate);
		 daysworked =  days;
		 salperday = salperday1;
		 
	 }
	 
	 public void DisplayWagers()
	 
	 {
		 System.out.println("Emplyoee type is Wager" );
		 
		 System.out.println("Employee NAme ---  " + name);
			System.out.println("Employee empno ----   " + Empnum);
			System.out.println("Employee address ---   " + Address);
			System.out.println("Employee date of birth----   " + dob);
			System.out.println("Employee Hiredate ----   " + Hiredate);
		 
		 
		 
		 System.out.println("number of days worked" +daysworked);
		 System.out.println("salary perday" + salperday);
		 
		 
	 }
	 public void dis()
	 {
		 
		 System.out.println("noting");
	 }
 }

 class Salaried  extends Employee{
	 double basicsal;
	 double hra;
	 double da;
	 double pf;
	 
	 Salaried (double bs1,double hra1,double da1, double pf1,int Empnum,String name ,String Address,String dob,String Hiredate)
	  
	 {
		 super(Empnum,name ,Address,dob,Hiredate);
		 basicsal = bs1;
		 hra = hra1;
		 da = da1;
		 pf = pf1;
		 
	 }
	 
	 
	 public void DisplaySalaried()
	 
	 {
		 
System.out.println("Emplyoee type is Salaried" );
		 
		 System.out.println("Employee NAme ---  " + name);
			System.out.println("Employee empno ----   " + Empnum);
			System.out.println("Employee address ---   " + Address);
			System.out.println("Employee date of birth----   " + dob);
			System.out.println("Employee Hiredate ----   " + Hiredate);
		 
		 System.out.println("BAsic sal --- " + basicsal);
		 System.out.println("HRA -- "+ hra);
		 System.out.println("da --- "+da);
		 System.out.println("PF --- "+pf);
		 
	 }
 }



