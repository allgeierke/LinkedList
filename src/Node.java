class Node {
    public int head;
    public int data;
    public Node next;

    /**
     * Constructor
     */
    public Node(int h, int d)
    {
    head = h;
    data = d;
    }

    /**
     *
     * @return head + data into a String
     */
    public String toString() {
        return head + " " + data;
    }
}

