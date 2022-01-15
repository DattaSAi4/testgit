import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class employee implements Serializable
{
	int eid;
	String name;
	employee()
	{
		
	}
	public employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", name=" + name + "]";
	}
	}
public class Serialization {
	public static void main(String[] args) throws IOException
	{
		employee e1 = new employee(1,"vinay");
		String path = "D:java/a2.txt";
		File q1 = new File(path);
		FileOutputStream q2 = new FileOutputStream(q1);
		ObjectOutputStream q3 = new ObjectOutputStream(q2);
		    q3.writeObject(e1);
		    System.out.println("matter As Successful written");
		    
		
	}

}
