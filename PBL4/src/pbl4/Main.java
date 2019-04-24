/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl4;

import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Paozinho pao = new Paozinho();
        Paozinho pao2 = new Paozinho();
        Frios frio = new Frios();
        Doce doce = new Doce();
        Doce doce2 = new Doce();
        
        pao.setDescription("Gourmet");
        pao.setFlavor("Goiabada");
        pao.setLifetime(30);
        pao.setPrice(2.50);
        
        pao2.setDescription("Gourmet");
        pao2.setFlavor("Queijo");
        pao2.setLifetime(25);
        pao2.setPrice(1);
        
        frio.setDescription("Defumado artasenalmente");
        frio.setLifetime(30);
        frio.setPrice(5);
        
        doce.setDescription("Brigadeiro");
        doce.setType("Mochi");
        doce.setPrice(2);
        doce.setLifetime(20);
        
        doce2.setDescription("Kindim");
        doce2.setType("Brasileiro");
        doce2.setPrice(3);
        doce2.setLifetime(20);
        
        pedido.additem(pao);
        pedido.additem(pao2);
        pedido.additem(doce);
        pedido.additem(doce2);
        pedido.additem(frio);
        
        pedido.setDate("Domingo");
        //pedido.setDate("segunda");
        
        System.out.println("Preço Total:"+pedido.totalprice());
        System.out.println("Tempo de Espera Total:"+pedido.totaldeliverytime()+" Minutos");
        System.out.println("Total Doces:"+pedido.totalcandy());
        System.out.println("Total Frios:"+pedido.totalcolds());
        System.out.println("Total Pãezinhos:"+pedido.totalbreadzinho());
        System.out.println("Total Produtos:"+pedido.totalproducts());
        System.out.println("Produtos: ~~~~~~ ");
        Doce doceshow;
        Paozinho paoshow;
        for(int cont=0; cont<pedido.getItens().size();cont++){
            if(pedido.getItens().get(cont) instanceof Frios){
                System.out.println("Produto "+(cont+1)+":"+" Frio: "+pedido.getItens().get(cont).getPrice()+"R$");
            }
            if(pedido.getItens().get(cont) instanceof Doce){
                doceshow=(Doce)pedido.getItens().get(cont);
                System.out.println("Produto "+(cont+1)+":"+" Doce "+doceshow.getType()+": "+doceshow.getPrice()+"R$"); 
            }
            if(pedido.getItens().get(cont) instanceof Paozinho){
                paoshow=(Paozinho)pedido.getItens().get(cont);
                System.out.println("Produto "+(cont+1)+":"+" Pãozinho "+paoshow.getFlavor()+": "+paoshow.getPrice()+"R#"); 
            }
        }
        
    }
    
}
