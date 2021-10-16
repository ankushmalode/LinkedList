package com.bridgelabz.Stacks;

public class Program {
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(79);
        System.out.println("Peek value in stack: "+stack.peak());
        stack.push(56);
        stack.push(99);
        stack.show();
        System.out.println("\nTop value pop: "+stack.pop());
        stack.show();
    }
}
