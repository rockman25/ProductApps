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
public class Software extends Product {
    
    private String version;
    
    public Software(){
        super();
        version = "";
        count++;
    }
    
    public void setVersion(String version){
        this.version = version;
    }
    
    public String getVersion(){
        return version;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + version;
    }
}
