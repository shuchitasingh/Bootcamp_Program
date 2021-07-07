package com.bridgelabzDay6;


class Nodes
{
    private int data;
    Nodes reference;
    Nodes head;

    public void insert(int data)
    {
        this.data = data;

        Nodes node = new Nodes();
        node.data = data;
        node.reference = null;

        if (head == null)
        {
            head = node;
        }
        else
        {
            Nodes n = head;
            while (n.reference != null) {
                n = n.reference;
            }
            n.reference = node;
        }
    }

    public void printList()
    {
        Nodes nodes = head;
        while(nodes.reference != null)
        {
            System.out.println(nodes.data);
            nodes = nodes.reference;
        }
        System.out.println(nodes.data);
    }


}

public class LinkedList {
    public static void main(String[] args) {
        Nodes n = new Nodes();
        n.insert(10);
        n.insert(30);
        n.insert(60);

        n.printList();
    }

}
