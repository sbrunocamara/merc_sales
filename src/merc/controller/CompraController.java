/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.controller;

import java.util.ArrayList;
import merc.Classes.CompraClasse;
import merc.Classes.EnderecoClasse;
import merc.Classes.ItemCompraClasse;
import merc.Classes.ItemPedidoClasse;
import merc.Classes.ProdutoClasse;
import merc.model.Compra;
import merc.model.Endereco;
import merc.model.ItemCompra;
import merc.model.ItemPedido;
import merc.model.Produto;


/**
 *
 * @author bsbru
 */
public class CompraController {
    
    public Integer newCompra(String data,Integer cod_fornecedor){
        

        
        CompraClasse compra = new CompraClasse();
        
        compra.setData(data);
        compra.setFornecedor_id(cod_fornecedor);
        
  
        
       
        Compra compraModel =  new Compra();
        
        Integer insert = compraModel.insert(compra);
        
        if(insert > 0){
            return insert;
        }else{
            return 0;
        }        
        
    }
    
    public  ArrayList<CompraClasse> select(){
        
            Compra compraModel =  new Compra();
          ArrayList<CompraClasse> compras = null;
          
          try{
             compras = compraModel.select();
             
        
            return compras;
        
             
          }catch(Exception e){

          }
          
         return compras;
        
        
    }
    
        public  ArrayList<CompraClasse> selectFilter(String dataInicial, String dataFinal){
        
            Compra compraModel =  new Compra();
          ArrayList<CompraClasse> compras = null;
          
          try{
             compras = compraModel.selectFilter(dataInicial, dataFinal);
             
        
            return compras;
        
             
          }catch(Exception e){

          }
          
         return compras;
        
        
    }
    
        public  ArrayList<CompraClasse> selectOnly(){
        
            Compra compraModel =  new Compra();
          ArrayList<CompraClasse> compras = null;
          
          try{
             compras = compraModel.selectOnly();
             
        
            return compras;
        
             
          }catch(Exception e){

          }
          
         return compras;
        
        
    }
    
    
        
    public CompraClasse update(CompraClasse compra){
        
             Compra compraModel =  new Compra();
            
          
          try{
              
            CompraClasse update = compraModel.update(compra);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return compra;
        
        
    }
    
    public boolean remove(CompraClasse compra){
        
         Compra compraModel =  new Compra();
  
              
            boolean remove = compraModel.remove(compra);
             
        
            return remove;
        
            
          
        
    }
    
           

    
}
