class Main {
    public static void main(String[] args)
    {
        LinkList theList = new LinkList();

        //Inserting Values
        theList.insert(22, 2);
        theList.insert(44, 4);
        theList.insert(66, 6);
        theList.insert(88, 8);

        System.out.println(theList.toString());

        //Testing File-Deleting(top down)
        while( !theList.isEmpty() )
        {
            Node aLink = theList.delete();
            System.out.print("Deleted ");
            System.out.println(aLink.toString());
        }
        System.out.println(theList.toString());
    }
}
