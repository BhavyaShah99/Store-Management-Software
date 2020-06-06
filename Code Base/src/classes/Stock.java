/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author bhavyashah
 */
public class Stock {
    private int id;
    private String nameofproduct;
    private String dateaddedtostock;
    
    public Stock(int ID,String NameOfProduct,String DateAddedToStock)
    {
        this.id = ID;
        this.nameofproduct = NameOfProduct;
        this.dateaddedtostock = DateAddedToStock;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getNameOfProduct()
    {
        return nameofproduct;
    }
    
    public String getDateAddedToStock()
    {
        return dateaddedtostock;
    }
}

