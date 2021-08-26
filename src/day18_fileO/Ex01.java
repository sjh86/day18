package day18_fileO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class Ex01 {

	public static void main(String[] args) throws Exception {
		File filePath = new File("C:/Users/107wk/Desktop/java/java-workspace/test/aaa.txt");
		FileOutputStream fos = new FileOutputStream(filePath,true);

		fos.write(97);
		fos.write('A');
		
	}

}
