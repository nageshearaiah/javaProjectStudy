package LabSession;

public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee emp = new Employee(1234 , "aditya","btmlaout","27/12/1987","23/08/2010");
	
             //emp.DisplayEmp();
             
             emp.changeAddress("girinagar'");
             
             Wagers Wag = new Wagers(30,750,1234 , "aditya","btmlaout","27/12/1987","23/08/2010");
            //Wag.DisplayEmp();
            Wag.DisplayWagers();
             Salaried Sal = new Salaried(10000, 5000,3300,555,1287 , "nagesh","btmlaout","27/12/1987","23/08/2010");
            // Sal.DisplayEmp();
             Sal.DisplaySalaried();
             
             
             Employee Wtype = (Employee)Wag;
             Wtype.DisplayEmp();
             ((Wagers) Wtype).dis();
             Employee Stype =  (Employee) Sal;
             Stype.DisplayEmp();
             Wagers Wag1 = Wag;
             //Wagers Wag1 = new Wagers(30,750,1234 , "aditya","btmlaout","27/12/1987","23/08/2010");
              if (Wag == Wag1)
              {
            	  
            	  System.out.println("both the Ref Wag and Wag1 are pointing to  same instance of the object");
              }
              else {
            	  System.out.println("both the Ref Wag and Wag1 are not pointing  same instance of th object");
              }
             
             
	}

}
