package com.bridgelabz.LinkedList;

public class DataStructures {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.insert(56);
        list.insert(30);
        list.insert(70);
        list.insertAtStart(34);
        list.insertAt(2,47);
        list.deleteAt(2);
        list.show();
    }
}