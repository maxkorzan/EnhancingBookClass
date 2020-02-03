import java.text.NumberFormat;
import java.util.Scanner;

public class BookApp {
    public static NumberFormat currency = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b = new Book();
        Book b2 = new Book("Julius Caesar");   //equal to b2.setTitle("Julius Caesar");

        b.setAuthor("Shakespeare");
        b.setTitle("Romeo and Juliet");
        b.setDescription("A tragic romance");
        b.setPrice(19.95);
        b.setInStock(true);

        b.getDisplayText();
        System.out.println(b.getAllInfo());;

        //////////////////////////
        System.out.print("\nEnter a number of desired books: ");
        int num = sc.nextInt();

        double totalCost = b.getBookPricing(num);
        System.out.println("Total cost: " + currency.format(totalCost));


        ///////////////////////////
        System.out.print("Enter a SKU: ");
        String SKU = sc.next();

        BookDB BookDB(SKU);

    }
}
