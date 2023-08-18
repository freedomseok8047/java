package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws
	FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("b.txt");
		Class c = Class.forName(className);
		return c;
	}
	public static void manin(String[] args) {
		ThrowsException test = new ThrowsException();
	try {
		test.loadClass("a.txt","java.lang.String");
	}catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println("File 캐치문 실행");
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
		System.out.println("Class 캐치문 실행");
	}catch (Exception e) {
		e.printStackTrace();
		System.out.println("Exception 캐치문 실행");
	}
	}
}
