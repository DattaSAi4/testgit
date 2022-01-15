import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class file1 {
	public static void main(String[] args) throws IOException
	{
	Scanner obj = new Scanner(System.in);
	System.out.println("enter a number");
	char ch = obj.nextLine().trim().charAt(0);
	String path = "D://java/s1D.txt";
	FileOutputStream s1 = new FileOutputStream(path);
	System.out.println("file had written Successfully");
	s1.write(ch);
	}

}
