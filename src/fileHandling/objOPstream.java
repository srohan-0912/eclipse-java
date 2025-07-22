package fileHandling;
//USING serialization 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class objOPstream {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\objHandling\\file.txt");
//	System.out.println(f1.mkdir());
	f1.createNewFile();
//	System.out.println(f1.exists());
	FileOutputStream fo=new FileOutputStream(f1);
	
	ObjectOutputStream obj=new ObjectOutputStream(fo);
	LaptopOP l1=new LaptopOP(1000,"osi");
	obj.writeObject();
	
	String s1="saturday is holiday";
	obj.write(s1.getBytes());
	obj.flush();
	
	
}
}
