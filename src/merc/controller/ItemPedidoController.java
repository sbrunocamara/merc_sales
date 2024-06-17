/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.controller;

import java.util.ArrayList;
import merc.Classes.EnderecoClasse;
import merc.Classes.ItemCompraClasse;
import merc.Classes.ItemPedidoClasse;
import merc.model.Endereco;
import merc.model.ItemCompra;
import merc.model.ItemPedido;


/**
 *
 * @author bsbru
 */
public class ItemPedidoController {
    
    public Integer newItemPedido(Integer pedido_id,Integer produto_id, Integer qtde, Integer valor_item){
        

        
        ItemPedidoClasse itemPedido = new ItemPedidoClasse();
        
        itemPedido.setPedido_id(pedido_id);
        itemPedido.setProduto_id(produto_id);
        itemPedido.setQtde(qtde);
        itemPedido.setValor_item(valor_item);
        
        
        ItemPedido itemPedidoModel =  new ItemPedido();
        
        Integer insert = itemPedidoModel.insert(itemPedido);
        
        if(insert > 0){
            return insert;
        }else{
            return 0;
        }        
        
    }
    
    public  ArrayList<ItemPedidoClasse> select(){
        
           ItemPedido itemPedidoModel =  new ItemPedido();
          ArrayList<ItemPedidoClasse> itemsPedido = null;
          
          try{
             itemsPedido = itemPedidoModel.select();
             
        
            return itemsPedido;
        
             
          }catch(Exception e){

          }
          
         return itemsPedido;
        
        
    }
    
        
    public ItemPedidoClasse update(ItemPedidoClasse itemPedido){
        
             ItemPedido itemPedidoModel =  new ItemPedido();
            
          
          try{
              
            ItemPedidoClasse update = itemPedidoModel.update(itemPedido);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return itemPedido;
        
        
    }
    
    public boolean remove(ItemPedidoClasse itemPedido){
        
         ItemPedido itemPedidoModel =  new ItemPedido();
  
              
            boolean remove = itemPedidoModel.remove(itemPedido);
             
        
            return remove;
        
            
          
        
    }

    
}
