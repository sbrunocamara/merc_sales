/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.controller;

import java.util.ArrayList;
import merc.Classes.EnderecoClasse;
import merc.Classes.ItemCompraClasse;
import merc.model.Endereco;
import merc.model.ItemCompra;


/**
 *
 * @author bsbru
 */
public class ItemCompraController {
    
    public Integer newItemCompra(Integer compra_id,Integer produto_id, Integer qtde, Integer valor){
        

        
        ItemCompraClasse itemCompra = new ItemCompraClasse();
        
        itemCompra.setCompra_id(compra_id);
        itemCompra.setProduto_id(produto_id);
        itemCompra.setQtde(qtde);
        itemCompra.setValor(valor);
        
        
        ItemCompra itemCompraModel =  new ItemCompra();
        
        Integer insert = itemCompraModel.insert(itemCompra);
        
        if(insert > 0){
            return insert;
        }else{
            return 0;
        }        
        
    }
    
    public  ArrayList<ItemCompraClasse> select(){
        
          ItemCompra itemCompraModel =  new ItemCompra();
          ArrayList<ItemCompraClasse> itemsCompra = null;
          
          try{
             itemsCompra = itemCompraModel.select();
             
        
            return itemsCompra;
        
             
          }catch(Exception e){

          }
          
         return itemsCompra;
        
        
    }
    
        
    public ItemCompraClasse update(ItemCompraClasse itemCompra){
        
            ItemCompra itemCompraModel =  new ItemCompra();
            
          
          try{
              
            ItemCompraClasse update = itemCompraModel.update(itemCompra);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return itemCompra;
        
        
    }
    
    public boolean remove(ItemCompraClasse itemCompra){
        
        ItemCompra itemCompraModel =  new ItemCompra();
  
              
            boolean remove = itemCompraModel.remove(itemCompra);
             
        
            return remove;
        
            
          
        
    }

    
}
