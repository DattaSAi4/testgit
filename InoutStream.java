import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Scanner;
public class InoutStream {
public static void main(String[] args) throws IOException
{
	Scanner d = new Scanner(System.in);
	System.out.println("enter a file");
	String path = d.nextLine();
	FileInputStream d4 = new FileInputStream(path);
	 int a = d4.read();
	while(a!=-1)
	{
	System.out.print((char)a);
	a = d4.read(); 	
	}
}
}
