import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyChar {
	
	// Copy file by reading and writing characters
	// The calling method must handle IO exceptions during copy
	public static void FileCopy(String input, String output) throws IOException{
		File in = new File(input);
		File out = new File(output);
		FileReader fr = null;
		FileWriter fw = null;

		// Create file reader and writer to read/write file contents
		// Throw file not found exceptions if the files do not exist
		try {
			fr = new FileReader(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			fw = new FileWriter(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int c;
		
		// Read and write file contents by character
		while ((c = fr.read()) != -1)
			fw.write(c);
			
		fr.close();
		fw.close();
	}

	public static void main(String[] args) {
		try {
			FileCopyBinary.FileCopy("E:\\eclipse\\workspace\\FileCopy\\test1.txt", "E:\\eclipse\\workspace\\FileCopy\\test1b.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileCopyChar.FileCopy("E:\\eclipse\\workspace\\FileCopy\\test1.txt",  "E:\\eclipse\\workspace\\FileCopy\\test1c.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
