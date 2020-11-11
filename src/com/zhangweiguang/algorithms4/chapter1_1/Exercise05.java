package com.zhangweiguang.algorithms4.chapter1_1;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import static edu.princeton.cs.algs4.StdIn.readDouble;

public class Exercise05 {
    public static void main(String[] args)
    {
        StdOut.println("please input two parameter");
        double x=readDouble();
        double y=readDouble();
        if(0<x&&x<1&&0<y&&y<1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
