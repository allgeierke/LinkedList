class LinkList {
    private Node first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        if (first != null) {
            return false;
        }
        return true;
    }

    public void insert(int h, int d) {
        Node newLink = new Node(h, d);
        newLink.next = first;
        first = newLink;
    }


    public Node delete() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public String toString() {
        System.out.print("List [first to last]: ");
        Node current = first;
        String list = "";
        while (current != null) {
            list += current.toString() + " ; ";
            current = current.next;
        }
        return list;
    }
}