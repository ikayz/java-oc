import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Books theHobbit = new Books();
        theHobbit.title = "The Hobbit: An Unexpected Journey";
        theHobbit.author =  "J.R.R Tolkien";
        theHobbit.numberOfPages = 430;

        String[] names = new String[4];
        names = new String[]{"Frodo", "Sam", "Merry", "Pippin", "Gandolf"};

        System.out.println("The book name is " + theHobbit.title + " written by " + theHobbit.author + " and has " +
                theHobbit.numberOfPages + " pages.");
        System.out.println(names[4]);
    }
}
