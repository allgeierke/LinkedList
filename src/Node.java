class Node {
    public int head;
    public int data;
    public Node next;

    public Node(int h, int d) // constructor
    {
    head = h;
    data = d;
    }

    public String toString() {
        return head + " " + data;
    }
}

