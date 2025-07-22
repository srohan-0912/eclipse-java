package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutPutStream {
public static void main(String[] args) throws IOException {
	File f1=new File("C:\\inner\\output.txt");
//	System.out.println(f1.mkdir());
	f1.createNewFile();
//	System.out.println(f1.exists());
	
	FileOutputStream fo=new FileOutputStream(f1);
	String name="rohan";
	fo.write(name.getBytes());
	fo.flush();
	
	FileInputStream fi=new FileInputStream(f1);
	int a=fi.read();
	while(a!=-1) {
		System.out.println((char)a);
		a=fi.read();
	}
}
}
