package Ex1;

import java.util.Scanner;

public class Book implements IDisplay, IInput{

    private int bookID;
    private String title;
    private String publisher;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book ID : ");
        this.bookID = sc.nextInt();

        System.out.println("Enter Title : ");
        this.title = sc.next();

        System.out.println("Enter Publisher : ");
        this.publisher = sc.next();
    }

    @Override
    public void print() {
        System.out.println("Book ID : " + this.bookID +
                            "\tTitle : " + this.title +
                            "\tPublisher : " + this.publisher);
    }

    @Override
    public void printDetails() {
        System.out.println("Book ID : " + this.bookID);
        System.out.println("Title : " + this.title);
        System.out.println("Publisher : " + this.publisher);
    }

}
