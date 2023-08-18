package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String enter = "\r\n";
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');
			fw.write(enter);
			fw.write(65);
			char [] buf = {'B','C','D','E','F','G'};
			fw.write(buf);
			fw.write(enter);
			fw.write("안녕하세요 잘 써지내요");
			fw.write(enter);
			fw.write(buf,1,2);
			fw.write(enter);
			fw.write("65");
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
