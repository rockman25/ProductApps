/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pete.biz;

/**
 *
 * @author schirmer
 */
public class Book extends Product {
    private String author;
    
    public Book(){
        super();
        author = "";
        count++;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public String getAuthor(){
        return author;
    }
    
    @Override
    public String toString(){
        return super.toString() + " by " + author;
    }
}
