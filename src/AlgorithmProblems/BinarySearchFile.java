package AlgorithmProblems;
/**
 * Program to search word from file
 */
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


	public class BinarySearchFile {
		public static int binarySearch(String[] arr, String str){
			int high = arr.length - 1, low = 0, mid;
			Arrays.sort(arr);
			while (low <= high) {
				mid = (high + low) / 2;
				if (str.equalsIgnoreCase(arr[mid])) {
					return mid;
				} else if (arr[mid].compareToIgnoreCase(str) < 0) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}

			return -1;
		}

		public static String[] fileRead(File file) throws IOException {
			String word = "";
			ArrayList<String> list = new ArrayList<String>();
			FileReader fr = new FileReader(file);
			int content;
			while ((content = fr.read()) != -1) {
				if (content == 32) {
					list.add(word);
					word = "";
				} else {
					word = word + String.valueOf((char) content);
				}
			}
			fr.close();
			String[] s = new String[list.size()];
			list.toArray(s);
			return s;
		}

	public static void main(String[] args) throws IOException {

		try {
			File file = new File("C:\\Users\\mraj\\mohan\\BinarySearch.txt");
			String arr[] = fileRead(file);
			for (String s : arr) {
				System.out.println(s);
			}
			while(true) {
			System.out.println("\nEnter word to search");
			String str = Utility.inputStringLine();
			int n = binarySearch(arr, str);
			if (n > 0) {
				System.out.println("found");
			} else {
				System.out.println("not found");
			}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}


	}



