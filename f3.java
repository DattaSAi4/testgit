import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.stream.FileImageOutputStream;
public class f3 {
	public static void main(String[] args) throws IOException
	{
		Scanner d1 = new Scanner(System.in);
		System.out.println("enter a String");
		String str = d1.nextLine().trim();
		FileOutputStream s2 = new FileOutputStream("D:java/s5.txt");
		              char[] ch = str.toCharArray();
		              for(char i:ch)
		              {
		            	  s2.write(i);
		              }
		              System.out.println("The String is Succesfully added to the FIle");
		
		
		
	}

}
