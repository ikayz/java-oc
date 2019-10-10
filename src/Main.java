import java.awt.print.Book;
import java.util.*;

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

        // Sets
        Set<String> ingredients = new HashSet<String>();
        ingredients.add("Chicken Soup");
        ingredients.add("Lettuce");
        ingredients.add("Rice");
        ingredients.add("Rosemary");

        // Dictionary
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("Ike", 23);
        myMap.put("Zeck", 9);
        myMap.put("Ikayz", 91);

        System.out.println("The book name is " + theHobbit.title + " written by " + theHobbit.author + " and has " +
                theHobbit.numberOfPages + " pages.");
        System.out.println(names[4]);
        System.out.println(myList);
        System.out.println(myStringList);
        myStringList.set(0, "Miti");
        System.out.println(myStringList);
        System.out.println(ingredients.contains("Rice"));
        System.out.println(myMap.get("Ike"));
    }
}
