package corejava;
import java.io.*;
 class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		//Creating File Reader Object
		File file = new File("D:/myFile.txt");
				//to read from the creating file
		FileReader reader = new FileReader(file);
		char chars[] =new char[(int) file.length()];
		//Reading Data From The File
		reader.read(chars);
		//Writing data to another file
		File out = new File("D:/copyofmyfile.txt");
		FileWriter Writer = new FileWriter(out);
		//Writing data to the file
		Writer.write(chars);
		Writer.flush();
		System.out.println("Data successfully written in the specified file");
		
		
		
		

	}

}
