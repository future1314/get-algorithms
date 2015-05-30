package getset.algs.fundamentals;

import java.util.Arrays;

import getset.algs.stdlib.StdDraw;
import getset.algs.stdlib.StdRandom;


public class DrawTest {

	public static void main(String[] args) {

		test1();
		
	}
	
	// 函数值
	private static void test1(){
		int n = 100;
		StdDraw.setXscale(0, n);
		StdDraw.setYscale(0, n*n);
		StdDraw.setPenRadius(0.01);
		for (int i = 1; i < n; i++){
			StdDraw.point(i, i);
			StdDraw.point(i, i*i);
			StdDraw.point(i, i*Math.log(i));
		}
	}
	
	// 随机数组
	private static void test2(){
		int n = 50;
		double[] a = new double[n];
		for (int i = 0; i < n; i++ ){
			a[i] = StdRandom.random();
		}
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			double x = 1.0*i/n;
			double y = a[i]/2.0;
			double rw = 0.5/n;
			double rh = a[i]/2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	}

}
