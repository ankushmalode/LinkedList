package com.bridgelabz.Queue;

public class Queue {
    int[] queue=new int[4];
    int size,front,rear;

    public void enQueue(int data){
        queue[rear]=data;
        rear=(rear+1)%4;
        size++;
    }

    public void show(){
        System.out.print("Elements : ");
        for (int i=0;i<size;i++){
            System.out.print(queue[(front+i)%4]+" ");
        }
        System.out.println();
    }
    public int deQueue(){
        int data=queue[front];
        front++;
        size--;
        return data;
    }
}