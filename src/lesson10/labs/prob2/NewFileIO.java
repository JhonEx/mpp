package lesson10.labs.prob2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class NewFileIO {
	private static final Logger LOG = Logger.getLogger(OldFileIO.class.getName());
//	public final static String FILE_LOCATION = "src/lesson10/labs/prob3/output.txt";
	public final static String FILE_LOCATION = "./output.txt";
	public final static String TO_PRINT = "This is the string to print to file.";
	
	void writeText(String filename, String text) {
		try(PrintWriter pWriter = new PrintWriter(new FileWriter(new File(filename)))) {
			pWriter.print(text);
			pWriter.flush();
		} catch(IOException e) {
			LOG.warning("IOException attempting to write a file: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		NewFileIO newFileIO = new NewFileIO();
		newFileIO.writeText(FILE_LOCATION, TO_PRINT);
		
	}
}
