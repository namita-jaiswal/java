package com.company;

class Node3 {
    int data;
    Node3 next;
    Node3(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedlistImplementation {
    void rPrint(Node3 head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        rPrint(head.next);
    }

    public static void main(String[] args) {
        Node3 head = new Node3(10);
        head.next = new Node3(20);
        head.next.next = new Node3(30);

        linkedlistImplementation list = new linkedlistImplementation();
        list.rPrint(head); // Output: 10 20 30
    }
}