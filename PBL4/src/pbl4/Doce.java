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
public class Doce extends Produtos {
    private String type;
    public Doce(){
        this.deliverytime=5;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    double x;
}
