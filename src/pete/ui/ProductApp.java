package pete.ui;

import java.util.Scanner;
import pete.db.ProductDB;
import pete.biz.Product;

/**
 *
 * @author pete
 */
public class ProductApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Product Viewer, MoFo");
        System.out.println();

        // perform 1 or more selections
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            System.out.println("Enter product code:\t");
            String productCode = sc.nextLine();  // read the product code

            // get the Product object
            Product p = ProductDB.getProduct(productCode);

            // display the output
            System.out.println();
            if (p!=null){
                System.out.println("Description: " + p.toString());
                System.out.println("Price:       " + p.getPriceFormatted());
            } else {
                System.out.println("No product matches this product code.\n");
            }

            System.out.println();
            System.out.println("Product count: " + Product.getCount() + "\n");

            // see if the user wants to continue
            System.out.println("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }


    }

}
