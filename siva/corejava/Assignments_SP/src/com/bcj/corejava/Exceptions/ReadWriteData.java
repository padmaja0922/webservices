package com.bcj.corejava.Exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * @author siva kiran This program is developed to read data from text file take
 *         out all the double lines and single line quotations .create a new file write the
 *         modified data to a new text file and opens it
 */

public class ReadWriteData {
	/**
	 * @param args
	 *            this method take the directory and file name from user
	 * @throws InterruptedException
	 * @throws IOException
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Directory name");
		String dir = sc.nextLine();
		System.out.println("Enter the file name");
		String fileName = sc.nextLine();
		transformAndCopyFile(dir, fileName);// method caling

	}

	public static void transformAndCopyFile(String dir, String fileName) throws InterruptedException {
		String sors = dir + ":\\" + fileName;

		FileReader read;
		try {

			read = new FileReader(sors);
			String line;
			BufferedReader rBufr = new BufferedReader(read);
			File file = new File("i:\\copy.txt");
			FileWriter write = new FileWriter(file);
			BufferedWriter wBufr = new BufferedWriter(write);

			boolean result = createNewFile(); // creating new file

			while ((line = rBufr.readLine()) != null) {// reading from file
				if (!line.equals("") && (!line.contains("//")))
					wBufr.write(" " + line);// writing to file

			}

			if ((new File("i:\\copy.txt")).exists()) {

				Process p = Runtime// open the written file
						.getRuntime().exec("rundll32 url.dll,FileProtocolHandler i:\\copy.txt");
				p.waitFor();

			} 
			else 
            System.out.println("File is not exists");
			rBufr.close();
			wBufr.close();
		}
		catch (FileNotFoundException e1) {

			System.out.println("file not found");
			e1.printStackTrace();
		} catch (IOException e) {
			System.out.println("Input/Output Exception");
			e.printStackTrace();
		}

	}

	private static boolean createNewFile() {
		// TODO Auto-generated method stub
		return false;
	}

}
