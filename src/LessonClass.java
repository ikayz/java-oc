public class LessonClass {
    public static void main(String[] args) {
        // Instantiate an object of class Book and assign it to a  variable named myBook
        Book myBook = new Book();

        // Assign a value to the title, author and numberOfPages fields of your object.
        myBook.title = "The Hobbit";
        myBook.author = "J.R.R Tolkien";
        myBook.numberOfPages = 430;

        //Print the values
        System.out.println("The title of the book is " + myBook.title + "\nIts author is " + myBook.author + "\nIt contains " + myBook.numberOfPages + " pages.");

    }
}
