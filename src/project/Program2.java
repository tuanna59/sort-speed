package project;

import java.io.*;
import java.util.*;

public class Program2 {

	public void run() {
		Program2 test = new Program2();
		String[] a;

		// Timing Bubble Sort
		a = test.readFile(Program1.getPath());
		double startTime = System.nanoTime();
		BubbleSort.bubbleSort(a, a.length);
		double time = (System.nanoTime() - startTime);
		test.writeFile(Program1.getPath().substring(0, Program1.getPath().length()-4) + " BubbleSort.txt", a);
		System.out.println("Total execution time of Bubble Sort is " + time/1000000000 + " seconds.");

		a = test.readFile(Program1.getPath());
		startTime = System.nanoTime();
		SelectionSort.selectionSort(a, a.length);
		time = (System.nanoTime() - startTime);
		test.writeFile(Program1.getPath().substring(0, Program1.getPath().length()-4) + " SelectionSort.txt", a);
		System.out.println("Total execution time of Selection Sort is " + time/1000000000 + " seconds.");

		a = test.readFile(Program1.getPath());
		startTime = System.nanoTime();
		InsertionSort.insertionSort(a, a.length);
		time = (System.nanoTime() - startTime);
		test.writeFile(Program1.getPath().substring(0, Program1.getPath().length()-4) + " InsertionSort.txt", a);
		System.out.println("Total execution time of Insertion Sort is " + time/1000000000 + " seconds.");

		a = test.readFile(Program1.getPath());
		startTime = System.nanoTime();
		MergeSort.mergeSort(a);
		time = (System.nanoTime() - startTime);
		test.writeFile(Program1.getPath().substring(0, Program1.getPath().length()-4) + " MergeSort.txt", a);
		System.out.println("Total execution time of MergeSort is " + time/1000000000 + " seconds.");
		
		a = test.readFile(Program1.getPath());
		startTime = System.nanoTime();
		QuickSort.quickSort(a, 0, a.length-1);
		time = (System.nanoTime() - startTime);
		test.writeFile(Program1.getPath().substring(0, Program1.getPath().length()-4) + " QuickSort.txt", a);
		System.out.println("Total execution time of QuickSort is " + (double)time/1000000000 + " seconds.");
		
	}

	public void writeFile(String fileName, String[] a) {
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			for (int i = 0; i < a.length; i++) {
				bufferedWriter.write(a[i]);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + fileName + "'");
		}
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
	
}
