package com.zhangweiguang.algorithms4.chapter1_1;

//import edu.princeton.cs.algs4.StdIn;

public class Exercise03 {

	public static void main(String[] args) 
	{
		
		System.out.println(args[0].equals(args[1]));
		System.out.println(args[1].equals(args[2]));
		
		if(args[0].equals(args[1])&&args[1].equals(args[2]))
			System.out.println("equal");
		else 
			System.out.println("not equal");
	}
	
/*Another version
  	public static void main(String[] args) {
		int a = StdIn.readInt();
		int b = StdIn.readInt();
		int c = StdIn.readInt();
		if (a == b && a == c) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
	}
*/
}
