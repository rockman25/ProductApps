/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pete.ui;

/**
 *
 * @author schirmer
 */
import java.util.Scanner;

import pete.biz.LineItem;
import pete.biz.Product;
import pete.db.ProductDB;

public class LineItemApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Item Calculator, MoFo");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        String choice ="y";
        while (choice.equalsIgnoreCase("y")){
            System.out.print("Enter product code:\t");
            String productCode = sc.nextLine();
            
            System.out.print("Enter quantity:\t");
            int quantity = Integer.parseInt(sc.nextLine());
            
            //get the Product object
            Product product = ProductDB.getProduct(productCode);
            
            //crete the Line Item object
            LineItem lineitem = new LineItem(product, quantity);
            
            
            //format and display output
            String message = "\nLINE ITEM\n" +
                    "Code:\t\t " + product.getCode() + "\n" +
                    "Description:\t " + product.getDescription() + "\n" +
                    "Price:\t\t " + product.getPriceFormatted() + "\n" +
                    "Quantity:\t " + lineitem.getQuantity() + "\n" +
                    "Total:\t\t " + lineitem.getTotalFormatted() + "\n";
            System.out.println(message);
            
            //see if the user wants to continue     
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye!");
    }
    
}
