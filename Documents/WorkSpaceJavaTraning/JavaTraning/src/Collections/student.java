package Collections;

import java.io.*;


import java.util.*;

 class  studentcollection implements Comparable {
	 String name;
	 String Class;
	 int age;
	 
	 public studentcollection(String name1,String Class1,int age1)
	 {
		 name = name1;
		 Class = Class1;
		 age = age1;
		 
	 }

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		studentcollection s = (studentcollection)arg0;
		if(this.age< s.age)
			return -1;
		else if (this.age == s.age)
			return 0;
		else
			return 1;
	
	}
	
	public String toString()
	{
		return  Class + " " + age + " " + name  ;
	}
	
	public boolean equals (Object obj){
		
		studentcollection s = (studentcollection)obj;
		if ((this.name == s.name )&& (this.age == s.age)){
			System.out.println("objects are matching");
		return true;
		
		}
		else
		{
			System.out.println("objects are not matching");
			return false;
			
			
		}
		
		
	}
	
	
	
 /*public void  writetext {
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/version.txt"));
		
		
		String s = "century link";
		byte[] b = s.getBytes();
		bos.write(b);
		bos.close();
		
		
	} */

 }
 

 
 
 public  class student {
		 
		public static void main(String[] args) {
			
			studentcollection stu1 = new studentcollection("Ramesh","testing",25);
			studentcollection stu2 = new studentcollection("Ramesh","automation",25);
			studentcollection stu3 = new studentcollection("Raju","qa",40);
			
	  	stu1.equals(stu2);
	
	
			
			TreeSet ts = new TreeSet();
			ts.add(stu1);
			ts.add(stu2);
			ts.add(stu3);
			
			HashSet  hs = new HashSet();
			hs.add(stu1);
			hs.add(stu2);
			hs.add(stu3);
			//System.out.println(hs.size());
			Iterator itre	=hs.iterator();
			
			while (itre.hasNext()) {
				studentcollection s = (studentcollection)itre.next();
				if (s.name.equalsIgnoreCase("raju"))
				{	
					System.out.println("NAme Matched ");
				       itre.remove();
				}
			
				
					
					
					
				}
				//System.out.println(s);
			
			System.out.println(hs);
				
				
				
			
			
			LinkedList l = new LinkedList();
			l.add(stu1);
			l.add(stu2);
			l.add(stu3);
			
			ArrayList  a = new ArrayList();
			a.add(stu1);
			a.add(stu2);
			a.add(stu3);
			
			
				System.out.println("Treeset output");		
				//System.out.println(ts);
				System.out.println("Hashset output");	
				//System.out.println(hs);
				System.out.println("LinkedList output");	
				//System.out.println(l);
				System.out.println("ArrayList output");	
				//System.out.println(a);
			
		} 
 
 
 
 
 
 }
