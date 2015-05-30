package getset.algs.fundamentals;

import getset.algs.stdlib.In;
import getset.algs.stdlib.StdIn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;

public class BinarySearch {

	public static void main(String[] args) throws FileNotFoundException {

		long begin = System.currentTimeMillis();
		int count1 = 0;
		int count2 = 0;
		int[] whiteList = In.readInts("data\\largeW.txt");
		Arrays.sort(whiteList);
		System.setIn(new FileInputStream("data\\largeT.txt"));
		while(!StdIn.isEmpty()) {
			int temp = StdIn.readInt();
			count1++;
			if(rank(whiteList, temp) < 0) {
				count2++;
				System.out.println(temp);
			}
		}
		System.out.println(count1 + "---" + count2 + ":" + (System.currentTimeMillis() - begin)/1000.0);
	}

	public static int rank(int[] a, int b) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo < hi) {
			int mid = lo + (hi-lo)/2;
			if (b < a[mid]) hi = mid - 1;
			else if (b > a[mid]) lo = mid + 1;
			else return b;
		}
		return -1;
	}
}
