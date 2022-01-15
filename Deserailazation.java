import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
public class Deserailazation {
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		String path = "D:java/a2.txt";
		File q1 = new File(path);
		FileInputStream q2 = new FileInputStream(q1);
		ObjectInputStream q3 = new ObjectInputStream(q2);
		  Object q4 = q3.readObject();
		               employee e1 =  (employee)q4;
		               System.out.println(e1.eid);
		               System.out.println(e1.name);
		
	}
}

