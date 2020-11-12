package com.zhangweiguang.algorithms4.chapter1_1;

import edu.princeton.cs.algs4.StdOut;
//Fibonacci sequence
public class Exercise06 {
    public static void main(String[] args)
    {
        int f=0,g=1;
        for(int i=0;i<=25;i++)
        {
            StdOut.println(f);
            f=f+g;
            g=f-g;
        }
    }

}
