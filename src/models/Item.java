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
public class Item {
    
    int id;
    String itemName;
    String description;
    String itemScale;
    boolean isConsumable;
    String status;

    public Item(int id, String itemName, String description, String itemScale, boolean isConsumable, String status) {
        this.id = id;
        this.itemName = itemName;
        this.description = description;
        this.itemScale = itemScale;
        this.isConsumable = isConsumable;
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setItemScale(String itemScale) {
        this.itemScale = itemScale;
    }

    public String getItemScale() {
        return itemScale;
    }

    public void setIsConsumable(boolean isConsumable) {
        this.isConsumable = isConsumable;
    }

    
    public boolean getIsConsumable(){
        return isConsumable;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
     @Override
    public String toString(){
    return id + itemName + description + itemScale + isConsumable + status;
    }
}
