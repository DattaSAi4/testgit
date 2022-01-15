import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class InputStream2 {
public static void main(String[] args) throws IOException
{
	Scanner i = new Scanner(System.in);
	System.out.println("enter the file");
	String path = i.nextLine();
	FileInputStream u = new FileInputStream(path);
	          byte[] se = new byte[u.available()];
	          u.read(se);
	          for(int i1 =0;i1<se.length;i1++)
	          {
	        	 System.out.print((char)se[i1]);
	          }
	          
	}
}
