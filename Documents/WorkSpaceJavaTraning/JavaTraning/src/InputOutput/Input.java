package InputOutput;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Input {
	
	public static void main(String[] args) throws Exception {
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/version.txt"));
		
		
		String s = "century link";
		byte[] b = s.getBytes();
		bos.write(b);
		bos.close();
		
		read R = new read();
		R.readtext();
		
	}

}

 class read {
	
	
	public void readtext()throws Exception{
	//	FileInputStream f = new FileInputStream("c:/version.txt");
		BufferedInputStream bis = new BufferedInputStream(System.in);
		System.out.println("enter name:");
		int i = bis.read();
		StringBuffer sb = new StringBuffer();
		while (i != 10){
			
			sb.append((char)i);
			i = bis.read();
		}
		bis.close();
		System.out.println(sb);
		}
	
		
	}
	
	
