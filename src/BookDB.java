import java.util.ArrayList;
import java.util.Scanner;

public class BookDB extends Book{
    //variables
    private ArrayList<Book> books;

    //constructors
    public BookDB() {
    }

    public BookDB(ArrayList<Book> books) {
        this.books = books;
        }

    //methods - getters and setters
    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    //methods - more methods

    public void setBookInfo(String sku) {
        switch(sku){
            case "Java1001":
                setTitle("Head First Java\t");
                setAuthor("Kathy Sierra and Bert Bates\t");
                setDescription("Easy to read Java workbook\t");
                setPrice(47.50);
                break;

            case "Java1002":
                setTitle("Thinking in Java\t");
                setAuthor("Bruce Eckel\t");
                setDescription("Details about Java under the hood\t");
                setPrice(20.00);
                break;

            case "Orcl1003":
                setTitle("OCP: Oracle Certified Professional Java SE\t");
                setAuthor("Jeanne Boyarsky\t");
                setDescription("Everything you need to know in one place\t");
                setPrice(45.00);
                break;

            case "Python1004":
                setTitle("Automate the Boring Stuff with Python\t");
                setAuthor("Al Sweigart\t");
                setDescription("Fun with Python\t");
                setPrice(10.50);
                break;

            case "Zombie1005":
                setTitle("The Maker's Guide to the Zombie Apocalypse\t");
                setAuthor("Simon Monk\t");
                setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi\t");
                setPrice(16.50);
                break;

            case "Rasp1006":
                setTitle("Raspberry Pi Projects for the Evil Genius\t");
                setAuthor("Donald Norris\t");
                setDescription("A dozen fiendishly fun projects for the Raspberry Pi!\t");
                setPrice(14.75);
                break;

            default:
                System.out.println("SKU not found");
                break;
        }
    }




    }



