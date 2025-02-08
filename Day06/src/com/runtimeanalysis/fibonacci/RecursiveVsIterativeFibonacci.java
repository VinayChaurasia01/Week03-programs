package com.runtimeanalysis.fibonacci;

public class RecursiveVsIterativeFibonacci {

    //fibonacci by recursion
    public static int recursiveFibonacci(int n){
        if (n <= 1) return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2); // call recursively
    }

    //fibonacci by iteration
    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    //create a function for calculation time taken by recursion
    public static long timeByRecursion(int n){
        long startTime = System.nanoTime();

        int ans = recursiveFibonacci(n);

        long endTime = System.nanoTime();

        return endTime-startTime;

    }

    //create a function for calculating time taken by Iteration
    public static long timeByIteration(int n){
        long startTime = System.nanoTime();

        int ans = fibonacciIterative(n);

        long endTime = System.nanoTime();

        return endTime-startTime;
    }

    //convert nano second to mili second
    public static double nanoToMiliSecond(long time){
        return (double) time/1000000;
    }

    public static void main(String[] args) {
        //create a array for different data sets
        int dataSet[] = {10,30,50};

        //perform for each data sets
        for(int i=0;i<dataSet.length;i++){
            int n = dataSet[i];

            System.out.println("Calculate fibonacci for value : " + n);
            System.out.println("Time taken by recursion : " +
                    nanoToMiliSecond(timeByRecursion(n)));
            System.out.println("Time taken by iteration : " +
                    nanoToMiliSecond(timeByIteration(n)));
            System.out.println();
        }
    }
}