class LinkList {
    private Node first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int id, double dd) {
        Node newLink = new Node(id, dd);
        newLink.next = first;
        first = newLink;
    }


    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Node current = first;
        while (current != null) {
            System.out.print(current.toString() + " ");
            current = current.next;
        }
        System.out.println("");
    }

    public String toString() {
        System.out.print("List (first-->last); ");
        Node current = first;
        String list = "";
        while (current != null) {
            list += current.toString();
            current = current.next;
        }
        return list;
    }
}