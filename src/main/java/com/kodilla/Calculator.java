package com.kodilla;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtrack(int c, int d) {
        return c - d;
    }

}
class Kodilla {
    public static void main(String args[]) {
        Calculator result = new Calculator();
        System.out.println(result.add(6, 7));
        System.out.println(result.subtrack(6, 7));


    }
}
