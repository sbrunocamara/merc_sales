/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.controller;

import java.util.ArrayList;
import merc.Classes.ItemCompraClasse;
import merc.Classes.ProdutoClasse;
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
             

            ItemCompraClasse select = itemCompraModel.selectById(itemCompra.getId());
            
            
            
            ItemCompraClasse update = itemCompraModel.update(itemCompra);
            
            
       
            
////            Integer produtoId = produto.getId();
////            Integer produtoQtde = produto.getQtde_estoque();   
////            
                   
            if(select.getQtde() < itemCompra.getQtde()){
                
            ProdutoController produtoController = new ProdutoController();
            ProdutoClasse produto = produtoController.selectById(itemCompra.getProduto_id());
                
                System.out.println("aqio");
                
               Integer Qtde = itemCompra.getQtde() - select.getQtde();
               produto.setQtde_estoque(Qtde);
//               produtoController.incrementaQuantidade(produto);
       
                
            }


            if(select.getQtde() > itemCompra.getQtde()){

            ProdutoController produtoController = new ProdutoController();
            ProdutoClasse produto = produtoController.selectById(itemCompra.getProduto_id());

//               Integer qtde = select.getQtde() - itemCompra.getQtde();
               
              System.out.println(produto.getId());
                              
               produto.setQtde_estoque(1);
                             
                System.out.println("vvvv");
   
//               produtoController.decrementaQuantidade(produto);
       

            }
            
        
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
    
      public  ArrayList<ItemCompraClasse> selectCompra(Integer id){
        
          ItemCompra itemCompraModel =  new ItemCompra();
          ArrayList<ItemCompraClasse> itemsCompra = null;
          
          try{
              
             itemsCompra = itemCompraModel.selectCompra(id);
             
        
            return itemsCompra;
        
             
          }catch(Exception e){

          }
          
         return itemsCompra;
        
        
    }

    
}
