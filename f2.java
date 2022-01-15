import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class f2 {
public static void main(String[] args) throws IOException
{
	Scanner obj = new Scanner(System.in);
	System.out.println("enter a character");
	char ch = obj.next().trim().charAt(0);
	String path2 = "D:java/s2.txt";
	FileOutputStream s2 = new FileOutputStream(path2);
	System.out.println("file had written succesfully");
	s2.write(ch);
	
	}
}
