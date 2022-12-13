package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesExample {

	public static void main(String[] args) {

		FileOperations f = new FileOperations();
		f.createFolder();
		System.out.println("List of files");
		System.out.println("--------------------");
		f.listFiles();
		// f.deleteFiles();
		System.out.println("List of files after delete");
		System.out.println("--------------------");
		f.listFiles();
		f.createFile();
		f.writeText("<html><body bgcolor='blue'><h1>Hello</h1></body></html>");
		String content = f.readText();
		System.out.println("\nFile has word Hello : " + content.contains("Hello"));
	}
}

class FileOperations {

	public void createFolder() {

		File f = new File("E:\\Java\\Programs");
		f.mkdirs();
		System.out.println("Folder has been created..");
	}

	public void createFile() {
		File f = new File("E:\\Java\\Programs\\sample.html");
		if (f.exists()) {
			return;
		}
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File has been created..");
	}

	public void listFiles() {
		File f = new File("E:\\Java\\Programs");
		File[] files = f.listFiles();
		if (files.length == 0) {
			System.out.println("No files found..");
		}
		for (File file : files) {
			System.out.println(file.getName());
		}
	}

	public void deleteFiles(String fileName) {
		File f = new File("E:\\Java\\Programs\\" + fileName);
		f.delete();
	}

	public void deleteFiles() {
		File f = new File("E:\\Java\\Programs");
		File[] files = f.listFiles();
		for (File file : files) {
			deleteFiles(file.getName());
		}
	}

	public void writeText(String message) {

		File f = new File("E:\\Java\\Programs\\sample.html");
		try {
			FileWriter fw = new FileWriter(f, true);
			fw.write("\n");
			fw.write(message);
			fw.close();
			System.out.println("Data has been saved..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String readText() {

		StringBuffer buffer = new StringBuffer();
		System.out.println("Data in file...");
		File f = new File("E:\\Java\\Programs\\sample.txt");
		try {
			FileReader fw = new FileReader(f);
			while (true) {

				int d = fw.read();
				if (d == -1) {
					break;
				}
				buffer.append((char) d);
				System.out.print((char) d);
			}

			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return buffer.toString();
	}
}
