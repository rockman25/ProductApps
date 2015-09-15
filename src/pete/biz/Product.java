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
public class Product {
    
    private String code;
    private String description;
    private double price;
    
    public Product(){
        this("","",0);
    }
    
    public Product(String code, String description, double price){
        this.code=code;
        this.description=description;
        this.price=price;
    }
    
    public void setCode(String code){
        this.code=code;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public void setDescription(String description){
        this.description=description;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setPrice(double price){
        this.price=price;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public String getPriceFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(this.price);
        return priceFormatted;
    }
    
    public void printToConsole(){
        printToConsole("|");
    }
    
    public void printToConsole(String separator){
        System.out.println(code+separator+description+separator+price);
    }
    
    public void printToConsole(String separator, String label){
        System.out.print(label);
        printToConsole(separator);
    }
    
}
