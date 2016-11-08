import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	// Binary search implementation takes a sorted array of integers and the search key
	// Declared as static so the method can be used without an instance of the class
	// Returns boolean true if the key value is found and false if not found in the array
	public static boolean binarySearch(int[] data, int key) {
		if (data == null) return false;
		int mid, low = 0;
		int high = data.length - 1;
		while(high >= low) {
			// test the value in the middle of the array
			mid = (low + high) / 2; 
			if(data[mid] == key) {
				return true;				
			}
			if(data[mid] < key) {
				// key is greater than mid so adjust range to search above mid
				low = mid + 1;	
			}
			if(data[mid] > key) {
				// key is less than mid so adjust range to search below mid
				high = mid - 1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		// The key value to search for
		int key = 6;
		
		// The size of the array and number of values read from the file
		// Use an ArrayList if amount of data in the file is not known
		int size = 6;
		
		// Name of the file containing integer values
		String filename = "E:\\eclipse\\workspace\\BinarySearch\\numbers.txt";
		
		// Read integers from the file and store in the array
		// Throw file not found exception if the file does not exist
		// Limit input read to array size
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int [] data = new int [size];
		int i = 0;
		while(scanner.hasNextInt() && (i < size)){
		   data[i++] = scanner.nextInt();
		}
		
		if (i < size)
			System.out.println("Warning: Only " + i + " values read from file");

		// Sort the array as a prerequisite for binary search
		Arrays.sort(data);
		
		// Print true or false output of binary search
		boolean result = binarySearch(data, key);
		System.out.println(result);
	}
}
