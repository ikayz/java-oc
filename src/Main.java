import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Books theHobbit = new Books();
        theHobbit.title = "The Hobbit: An Unexpected Journey";
        theHobbit.author =  "J.R.R Tolkien";
        theHobbit.numberOfPages = 430;

        System.out.println("The book name is " + theHobbit.title + "written by " + theHobbit.author + " and has " +
                theHobbit.numberOfPages + " pages.");
    }
}
