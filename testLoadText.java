package medianHeap;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class testLoadText {
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Test loadText class");
		loadText tst = new loadText("data/input_random_10_40.txt");
		ArrayList<Integer> s = tst.get();
		System.out.println("Start testing: ");
		for(int x : s){
			System.out.println(x);
		}
	}
}
