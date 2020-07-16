class Main {
    public static void main(String[] args)
    {
        LinkList theList = new LinkList();

        //Inserting Values
        theList.insert(56);
        theList.insert(37);
        theList.insert(38);
        theList.insert(12);

        System.out.println(theList.toString());

        theList = theList.reverse();

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
