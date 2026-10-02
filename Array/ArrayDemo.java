public class ArrayDemo {

    public static void main(String[] args) 
    {
        MyArray myarray = new MyArray(); // Object created -> constructor is called first  
        
        System.out.println("Initial Array : ");
        myarray.Printelements(); 

        myarray.insertAtEnd(10);
        myarray.insertAtEnd(20);
        myarray.insertAtEnd(30);
        myarray.insertAtEnd(40);
        myarray.insertAtEnd(50);

        System.out.println("==========================================");
        System.out.println("After Inserting : ");
        System.out.println();

        myarray.Printelements();

        System.out.println("==========================================");

        // myarray.insertAtStart(77);

        // System.out.println("After Inserting 77 at start");
        // System.out.println();

        // myarray.Printelements();

        // System.out.println("==========================================");

        // myarray.insertAtAnyPosition(2, 24);

        // System.out.println("After Insert at any position");

        // System.out.println();

        // myarray.Printelements();

        // System.out.println("==========================================");

        // // myarray.insertAtAnyPosition(-1, 99);
        // // myarray.insertAtAnyPosition(7, 100);

        // System.out.println("==========================================");

        /* System.out.println("Inserting at Invalid Positions");
        myarray.Printelements();

        System.out.println("==========================================");

        // Array is full
        myarray.insertAtEnd(30);
        myarray.insertAtStart(1);
        myarray.insertAtAnyPosition(2, 50); */

        //================Deletion===================
        myarray.deleteFromEnd();
        System.out.println("After Deleting from End");
        myarray.Printelements();

        myarray.deleteAtStart();
        System.out.println("After Deleting from start");
        myarray.Printelements();

        myarray.deleteAtAnyPosition(2);
        System.out.println("After Deleting from the position");
        myarray.Printelements();

    }

}