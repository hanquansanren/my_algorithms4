package com.zhangweiguang.algorithms4.chapter1_1;

import edu.princeton.cs.algs4.StdOut;
//Fibonacci sequence xian
public class Exercise06 {
    public static void main(String[] args)
    {
        int f=0,g=1;
        for(int i=0;i<=20;i++)
        {
            StdOut.println(f);
            f=f+g;
            g=f-g;
        }
    }

}
