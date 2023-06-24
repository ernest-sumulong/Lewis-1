/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author chris
 */
public class Category {
    int id;
    String itemCategory;

    public Category(int id, String itemCategory) {
        this.id = id;
        this.itemCategory = itemCategory;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    
     @Override
    public String toString(){
    return id + itemCategory;
    }
}
