/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl4;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
public class Pedido {
    private ArrayList<Produtos> itens;
    private String date;
    public Pedido(){
        itens= new ArrayList<>();
    }
    
    public double totalprice(){
        double totalprice=0;
        for(int i=0;i<getItens().size();i++){
            totalprice+=getItens().get(i).price;
        }
        return totalprice;
    }
    public double totaldeliverytime(){
        double deliverytime=0;
        for(int i=0;i<getItens().size();i++){
            deliverytime+=getItens().get(i).discount(getItens().get(i), this.getDate());
        }
        return deliverytime;
    }
    
    public int totalcandy(){
        int cont=0;
        for(int i=0;i<getItens().size();i++){
            if(getItens().get(i) instanceof Doce){
                cont++;
            }
        }
        return cont;
    }
    public int totalcolds(){
        int cont=0;
        for(int i=0;i<getItens().size();i++){
            if(getItens().get(i) instanceof Frios){
                cont++;
            }
        }
        return cont;
    }
    public int totalbreadzinho(){
        int cont=0;
        for(int i=0;i<getItens().size();i++){
            if(getItens().get(i) instanceof Paozinho){
                cont++;
            }
        }
        return cont;
    }
    
    public int totalproducts(){
        return this.totalbreadzinho()+this.totalcandy()+this.totalcolds();
    }

    public ArrayList<Produtos> getItens() {
        return itens;
    }

    public void additem(Produtos item) {
        this.itens.add(item);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
