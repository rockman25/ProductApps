/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pete.biz;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 *
 * @author schirmer
 */
public class Invoice {
    //the instance variable
    private ArrayList<LineItem> lineItems;
    
    //the constructor
    public Invoice(){
        lineItems=new ArrayList<>();
    }
    
    // a method that adds a line item
    public void addItem(LineItem lineItem){
        lineItems.add(lineItem);
    }
    
    // the get accessor for the line item collection
    public ArrayList<LineItem> getLineItems(){
        return lineItems;
    }
    
    // a method that gets the invoice total
    public double getTotal(){
        double invoiceTotal = 0;
        for (LineItem lineItem : lineItems) {
            invoiceTotal += lineItem.getTotal();
        }
        return invoiceTotal;
    }
    
    // a method that returns the invoice total in currency format
    public String getTotalFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(getTotal());
    }
}
