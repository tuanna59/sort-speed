package project;

import java.io.*;
import java.util.*;

public class Program1 {
	private static String path;
	// Read File
	public void readFile(String path, Set<String> set){
		try {
			FileReader file = new FileReader(path);

			BufferedReader reader = new BufferedReader(file);
			String line = null;
			while ((line = reader.readLine()) != null) {
				filter(line, set);
			}
			reader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + path + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + path + "'");
		}
	}
	
	// Write File
	public void writeFile(String path, Set<String> set) {
		try {
			FileWriter fileWriter = new FileWriter(path);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			int d = 0;
			
			Iterator it = set.iterator();
			while(it.hasNext()){
				d++;
				bufferedWriter.write((String)it.next());
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
			System.out.println("Wrote " + d + " words.");
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + path + "'");
		}
	}

	// Remove special character and number, keep text only
	public static void filter(String str, Set<String> set) {
		int i, start, end;
		start = end = i = 0;
		while (i < str.length() - 1) {
			start = end;
			if (!Character.isLetter(str.charAt(i))) {
				if (Character.isLetter(str.charAt(i + 1)))
					start = end = i + 1;
			} else {
				if (i + 2 == str.length())
					end = str.length();
				if (!Character.isLetter(str.charAt(i + 1)))
					end = i + 1;
			}
			if (start != end)
				set.add(str.substring(start, end));
			i++;
		}
	}
	
	public static String getPath(){
		return path;
	}
	
	public void run() {
		Program1 test = new Program1();
		String fileName;
		Scanner kb = new Scanner(System.in);
		Set<String> set = new HashSet<String>();

		System.out.print("Enter filename: ");
		fileName = kb.nextLine();
		test.readFile(fileName, set);

		System.out.print("Enter name of output: ");
		path = kb.nextLine();
		test.writeFile(path, set);
	}
}
