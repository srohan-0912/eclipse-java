package fileHandling;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class file {
public static void main(String[] args) throws IOException{
	File f1=new File("C:\\Ece file\\inner\\file.txt\\name.txt");
	//mkdir() ->is only responsible for creating folder 
	
	f1.createNewFile();
//	System.out.println(f1.exists());
	
    FileWriter fw=new FileWriter(f1);
    fw.write("file handling");
    fw.flush();
	fw.write("query");
	fw.close();
	
	FileReader fr=new FileReader(f1);
	int a=fr.read();
	while(a!=-1) {
		System.out.println((char)a);
		a=fr.read();
	}
}
}
