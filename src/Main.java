import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Books theHobbit = new Books();
        theHobbit.title = "The Hobbit: An Unexpected Journey";
        theHobbit.author =  "J.R.R Tolkien";
        theHobbit.numberOfPages = 430;

        // Array
        String[] names = new String[4];
        names = new String[]{"Frodo", "Sam", "Merry", "Pippin", "Gandolf"};

        // Multidimensional array
        int[][] myNumbers = new int[3][2];

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(23);
        myList.add(1, 9);
        myList.add(2,91);
        List<String> myStringList = new ArrayList<String>();
        myStringList.add("Isaac");
        myStringList.add("Ike");

        System.out.println("The book name is " + theHobbit.title + " written by " + theHobbit.author + " and has " +
                theHobbit.numberOfPages + " pages.");
        System.out.println(names[4]);
        System.out.println(myList);
        System.out.println(myStringList);
        myStringList.set(0, "Miti");
        System.out.println(myStringList);
    }
}
