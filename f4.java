import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.stream.FileImageOutputStream;
public class f4
{
	public static void main(String[] args) throws IOException
	{
		Scanner d1 = new Scanner(System.in);
		System.out.println("enter a String");
	String str = d1.nextLine().trim();
		FileOutputStream s2 = new FileOutputStream("D:java/s5.txt");
		                 byte[] a= str.getBytes();
		                 s2.write(a);
		                 System.out.println("a string had loaded successfully");
	}
}