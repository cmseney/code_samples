import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBinary {
	static int bufsize = 1024;

	// Copy file by reading and writing bytes
	// The calling method must handle IO exceptions during copy
	public static void FileCopy(String input, String output) throws IOException{
		FileInputStream in = null;
		FileOutputStream out = null;
		
		// Create input and output streams to read/write file contents
		// Throw file not found exceptions if the files do not exist
		try {
			in = new FileInputStream(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			out = new FileOutputStream(output);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		byte [] buf = new byte[bufsize];
		int bytesread;
		
		// Read bufsize bytes from the input file and write to the output file
		while ((bytesread = in.read(buf)) != -1)
			out.write(buf, 0, bytesread);
		
		in.close();
		out.close();
	}
}
