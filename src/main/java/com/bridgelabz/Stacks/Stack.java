package com.bridgelabz.Stacks;

class Stack {
    int[] stack=new int[3];
    int i=0;
    public void push(int data){
        stack[i]=data;
        i++;
    }
    public void show(){
        for (int i:stack)
            System.out.print(i+" ");
    }
}
