package stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
//		try(FileInputStream fis = new FileInputStream("reader.txt")){ 
		//한글을 한글자가 1byte씩이 아님으로 FileInputStream으로 불러오면 오류남
		try (FileReader fis = new FileReader("reader.txt")){
			int i ;
			while((i =  fis.read()) != -1) {
					System.out.print((char)i);
				}
				System.out.println("end");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
	}
	}
}
