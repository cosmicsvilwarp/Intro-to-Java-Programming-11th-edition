/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args)throws Exception {

		if (args.length < 3) {
			System.out.printf("(Invalid args) Proper usage: java Exercise_12 src1, src2 ... targetFile");
			System.exit(0);
		}

		File[] splitFiles = new File[args.length - 1];
		for (int i = 0; i < splitFiles.length; i++) {
			//Create Files
			splitFiles[i] = new File(args[i]);
			// Verify if src files exists
			if (!splitFiles[i].isFile()) {
				throw new FileNotFoundException(splitFiles[i].getAbsolutePath() + " file not found.");
			}
		}
		
		// Combine files into targetFile
		File targetFile = new File(args[args.length - 1]);

		try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(targetFile))) {

			int buffer;
			for (File f : splitFiles) {
				try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(f))) {

					while ((buffer = in.read()) != -1)
						out.write(buffer);

				}
			}
		}

	}
}