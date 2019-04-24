/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl4;

/**
 *
 * @author felip
 */
public abstract class Produtos {
    protected double deliverytime;
    protected double price;
    protected String description;
    protected int lifetime;
    
    // Function
    
    
    
    
    public double discount(Produtos item, String date){
        if(date.equalsIgnoreCase("sabado") || date.equalsIgnoreCase("domingo")){
            if(item instanceof Doce){
                return this.deliverytime*1.2;
            }
            if(item instanceof Paozinho){
                return this.deliverytime*1.15;
            }
            if(item instanceof Frios && date.equalsIgnoreCase("domingo")){
                return this.deliverytime*1.10;
            }
        }
        return this.deliverytime; 
    }
    
    // Getters
    
    public double getDeliverytime() {
        return deliverytime;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getLifetime() {
        return lifetime;
    }
    
    // Setters

    public void setDeliverytime(double deliverytime) {
        this.deliverytime = deliverytime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }
    
}
