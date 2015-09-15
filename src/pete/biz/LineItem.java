/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pete.biz;

import java.text.NumberFormat;

/**
 *
 * @author schirmer
 */
public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(){
        this.product=null;
        this.quantity=0;
    }
    
    public LineItem(Product product, int quantity){
        this.product=product;
        this.quantity=quantity;
    }
    
    public void setProduct(Product product){
        this.product=product;
    }
    
    public Product getProduct(){
        return this.product;
    }
    
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getTotal(){
        double total=quantity*product.getPrice();
        return total;
    }
    
    public String getTotalFormatted(){
        double total=quantity*product.getPrice();
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String totalFormatted = currency.format(total);
        return totalFormatted;
    }
}