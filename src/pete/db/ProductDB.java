/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pete.db;

import pete.biz.Product;
import pete.biz.Book;
import pete.biz.Software;

public class ProductDB {
    
    public static Product getProduct(String productCode){
        
        Product p = null;
        
        //fill the Product object with data
       if (productCode.equalsIgnoreCase("java")
               || productCode.equalsIgnoreCase("jsp")
               || productCode.equalsIgnoreCase("mysql")){
            Book b = new Book();
            if (productCode.equalsIgnoreCase("java")){
                b.setCode(productCode);
                b.setPrice(57.50);
                b.setDescription("Murach\'s Java Programming");
                b.setAuthor("Joel");
            } else if (productCode.equalsIgnoreCase("jsp")){
                b.setPrice(57.50);
                b.setCode(productCode);
                b.setDescription("Murach\'s Java Servlets and JSP");
                b.setAuthor("Mike");
            } else if (productCode.equalsIgnoreCase("mysql")){
                b.setPrice(54.50);
                b.setDescription("Murach\'s MySQL");
                b.setCode(productCode);
                b.setAuthor("Jimmy");
            } 
            p = b; // set Product object equal to the Book object
       } else if (productCode.equalsIgnoreCase("netbeans")) {
           Software s = new Software();
           s.setCode("netbeans");
           s.setDescription("NetBeans");
           s.setPrice(0.00);
           s.setVersion("8.0");
           p = s; // set Product object equal to the SOftware object
       }
       return p;
    }
}
