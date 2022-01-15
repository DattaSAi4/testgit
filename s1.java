import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class s1 {
public static void main(String[] args) throws IOException
{
	Scanner obj = new Scanner(System.in);
	System.out.println("enter a character");
	char ch = obj.next().trim().charAt(0);
	FileOutputStream  s1 = new FileOutputStream("D:java/q1.txt");
	    s1.write(ch);
	
	}
}

