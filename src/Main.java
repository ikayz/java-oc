import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Books theHobbit = new Books();
        theHobbit.title = "The Hobbit: An Unexpected Journey";
        theHobbit.author =  "J.R.R Tolkien";
        theHobbit.numberOfPages = 430;

        String[] names = new String[4];
        names = new String[]{"Frodo", "Sam", "Merry", "Pippin", "Gandolf"};

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(23);
        myList.add(1, 9);
        myList.add(2,91);

        System.out.println("The book name is " + theHobbit.title + " written by " + theHobbit.author + " and has " +
                theHobbit.numberOfPages + " pages.");
        System.out.println(names[4]);
        System.out.println(myList);
    }
}
