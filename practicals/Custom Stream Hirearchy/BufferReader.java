package corejava;

import java.io.BufferedReader;
import java.io.FileReader;

 class BufferReader {  // main class

	public static void main(String[] args) throws Exception{ // main method
		//Creating File Reader Object
		FileReader file = new FileReader("D:/myfile1.txt");
		//to read from the creating file
		BufferedReader br = new BufferedReader(file);
int i;
//Call Read() Method By Using While Loop
while((i= br.read())!= -1){
	System.out.print((char)i);
}
//Call close() Method
br.close();
file.close();
	}

}
