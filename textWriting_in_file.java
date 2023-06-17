package ProgramPractise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class textWriting_in_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileWriter fw=new FileWriter("C:\\Users\\ASUS\\OneDrive\\Desktop\\TEXT\\text1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("\n Vikram");
		bw.write("\n Aniket");
		bw.close();
		
	}

}
