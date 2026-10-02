public class ArrayDemo {

    public static void main(String[] args) 
    {
        MyArray myarray = new MyArray(); // Object created -> constructor is called first  
        
        System.out.println("Initial Array : ");
        myarray.Printelements(); 

        myarray.insertAtEnd(58);
        myarray.insertAtEnd(78);
        myarray.insertAtEnd(97);

        System.out.println("==========================================");
        System.out.println("After Inserting 58, 78 and 97");
        System.out.println();

        myarray.Printelements();

        System.out.println("==========================================");

        myarray.insertAtStart(77);

        System.out.println("After Inserting 77 at start");
        System.out.println();

        myarray.Printelements();

        System.out.println("==========================================");

        myarray.insertAtAnyPosition(2, 24);

        System.out.println("After Insert at any position");

        System.out.println();

        myarray.Printelements();

        System.out.println("==========================================");

        myarray.insertAtAnyPosition(-1, 99);
        myarray.insertAtAnyPosition(7, 100);

        System.out.println("==========================================");

        System.out.println("Inserting at Invalid Positions");
        myarray.Printelements();

        System.out.println("==========================================");

        // Array is full
        myarray.insertAtEnd(30);
        myarray.insertAtStart(1);
        myarray.insertAtAnyPosition(2, 50);
    }

}