package medianHeap;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class testMedianHeap {
	public static void main(String[] args) throws FileNotFoundException{
		System.out.println("Test medianHeap class");
		//loadText tst = new loadText("data/input_random_33_2560.txt");
		loadText tst = new loadText("data/Median.txt");
		ArrayList<Integer> s = tst.get();
		System.out.println("Start testing: ");
		
		heap mh = new heap();
		int sum = 0;
		for(int x : s){
			//System.out.print("New entry: ");
			//System.out.print(x);
			mh.add(x);
			//System.out.print("  Median: ");
			//System.out.println(mh.median());
			sum = sum + mh.median();
		}
		System.out.println("Sum%10000: " + sum % 10000);
	}
}
