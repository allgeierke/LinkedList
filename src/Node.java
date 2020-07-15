class Node {
    public int iData;
    public double dData;
    public Node next;

    public Node(int id, double dd) // constructor
    {
    iData = id;
    dData = dd;
    }

    public String toString() {
        return iData + " " + dData;
    }
}

