package project;

import java.io.*;
import java.util.*;

public class Program3 {
	public void run(){
		Program3 test = new Program3();
		String [] a = new String [5];
		
		// Append all text in each file to an element to comparing
		String path = Program1.getPath().substring(0, Program1.getPath().length()-4) ;
		a[0] = test.appendString(path + " BubbleSort.txt");
		a[1] = test.appendString(path + " InsertionSort.txt");
		a[2] = test.appendString(path + " SelectionSort.txt");
		a[3] = test.appendString(path + " MergeSort.txt");
		a[4] = test.appendString(path + " QuickSort.txt");
		
		// Compare between files
		if(a[0].equals(a[1]) && a[1].equals(a[2]) && a[2].equals(a[3]) && a[3].equals(a[4]))
			System.out.println("All file are same.");
		else
			System.out.println("Not Same.");
		
		// Write output
		test.writeFile("output.txt", test.readFile(path + " QuickSort.txt"));
		
		// Print out in console
		String [] b = test.readFile("output.txt");
		System.out.println("Output: \n");
		for(int i = 0; i<b.length; i++)
			System.out.println(b[i]);
 	}
	
	public String[] readFile(String fileName) {
		try {
			List<String> arr = new ArrayList<String>();
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				arr.add(line);
			}
			bufferedReader.close();
			return arr.toArray(arr.toArray(new String[arr.size()]));
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
		return null;
	}
	
	public String appendString(String path){
		String thisLine = null;
		try{
			FileReader fileReader = new FileReader(path);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuilder sb = new StringBuilder();
			while ((thisLine = bufferedReader.readLine()) != null)
				sb.append(thisLine);
			bufferedReader.close();
			return sb.toString();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + path + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + path + "'");
		}
		return null;
	}
	
	public void writeFile(String fileName, String [] arr) {
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			
			int max = arr[0].length();
			for(int i=1; i<arr.length;i++){
				if(arr[i].length() > max)
					max = arr[i].length();
			}
			
			for(int k=0;k<(arr.length/11)+1;k++){
				for(int i = 0; i<12;i++){
					if(11*k+i >= arr.length)
						break;
					writer.write(arr[11*k+i]);
					if(arr[11*k+i].length() < max)
						for(int j = 0; j< max - arr[11*k+i].length(); j++)
								writer.write(" ");
					writer.write("  ");
				}
				writer.newLine();
			}
			
			writer.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + fileName + "'");
		}
	}
}
