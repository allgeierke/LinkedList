class LinkList implements LinkedList {
    private Node first;

    public LinkList() {
        first = null;
    }

    /**
     * Checks if the linkedlist is empty
     * @return if list is empty or not
     */
    public boolean isEmpty() {
        if (first != null) {
            return false;
        }
        return true;
    }

    /**
     * Inserts value into the linkedlist into the top
     */
    public void insert(int d) {
        Node newLink = new Node(d);
        newLink.next = first;
        first = newLink;
    }


    /**
     * Deletes the "first" value in the list.
     */
    public Node delete() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    /**
     * Makes a String out of the values to output
     */
    public String toString() {
        System.out.print("List [first to last]: ");
        Node current = first;
        String list = "";
        while (current != null) {
            list += current.toString() + ";";
            current = current.next;
        }
        return list;
    }

    public LinkList reverse() {
        LinkList newList = new LinkList();
        Node current = first;
        while (current!=null) {
            int value = current.data;
            newList.insert(value);
            current = current.next;
        }
        return newList;
    }
}