package Ex1;

public class MyMain {

    public static void main(String[] args) {

        //create an object of Book
        Book b = new Book();

        //create an object from Student
        Student s = new Student();

        IDisplay ref1; //create variable from IDisplay
        IInput ref2; //create variable from IInput

        // ref1 variable is now pointing to Book object. ref1 object type is Book, reference type is IDisplay
        ref1 = new Book();
        ref1.printDetails();

        // ref2 variable is now pointing to Student object. ref2 object type is Student, reference type is IInput
        ref2 = new Student();
        ref2.input();

        b.input();
        b.print();
        b.printDetails();

        s.input();
        s.print();
        s.printDetails();

    }

}