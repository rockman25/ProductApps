/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pete.db;

import pete.biz.Product;

/**
 *
 * @author schirmer
 */
public class ProductDB {
    
    public static Product getProduct(String productCode){
        
        Product product = new Product();
        
        //fill the Product object with data
        product.setCode(productCode);
        if (productCode.equalsIgnoreCase("java")){
            product.setPrice(57.50);
            product.setDescription("Murach\'s Java Programming");
        } else if (productCode.equalsIgnoreCase("jsp")){
            product.setPrice(57.50);
            product.setDescription("Murach\'s Java Servlets and JSP");
        } else if (productCode.equalsIgnoreCase("mysql")){
            product.setPrice(54.50);
            product.setDescription("Murach\'s MySQL");
        } else {
            product.setDescription("Unknown");
        }
        return product;
    }
}
