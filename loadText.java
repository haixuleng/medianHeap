package medianHeap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files
public class loadText {
	String fileToLoad;
	int length = 0;
	//int[] data;
	public loadText(String fileName) throws FileNotFoundException {
		fileToLoad = fileName;
		System.out.println(fileName);
		size();
	}

	public void size() throws FileNotFoundException {
		int size = 0;
		File myObj = new File(fileToLoad);
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()) {
			size ++;
			myReader.nextLine();
			//System.out.println("Length of Input: " + size);
		}
		//myReader.close();
		length = size;
		System.out.println("Length of Input: " + size);
	}

	public ArrayList<Integer> get() throws FileNotFoundException {
		// return an array of arrays
		//size();
		ArrayList<Integer> initData = new ArrayList<Integer>(length);
		//System.out.println(length);
		File myObj = new File(fileToLoad);
		Scanner myReader = new Scanner(myObj);
		while(myReader.hasNextLine()) {
			String[] data = myReader.nextLine().split("\\s");
			int node = Integer.parseInt(data[0]);
			//System.out.println(node - 1);
			initData.add(node);
		}
		myReader.close();
		return initData;
	}
}
