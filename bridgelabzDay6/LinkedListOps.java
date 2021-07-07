package com.bridgelabzDay6;


class Node {
    int data;
    Node nextRef;
}

class Operational {
    Node first;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.nextRef = null;

        if (first == null) {
            first = node;
        }
        else
        {
            Node n = first;
            while (n.nextRef != null) {
                n = n.nextRef;
            }
            n.nextRef = node;
        }
    }

    public void showList ()
    {
        Node node = first;
        while(node.nextRef != null)
        {
            System.out.println(node.data);
            node = node.nextRef;
        }
        System.out.println(node.data);
    }
}

public class LinkedListOps {
    public static void main(String[] args) {
        Operational ops = new Operational();
        ops.insert(10);
        ops.insert(20);
        ops.insert(30);

        ops.showList();

    }
}