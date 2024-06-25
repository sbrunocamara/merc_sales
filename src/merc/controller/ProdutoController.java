/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package merc.controller;

import java.util.ArrayList;
import merc.Classes.EnderecoClasse;
import merc.Classes.ItemCompraClasse;
import merc.Classes.ItemPedidoClasse;
import merc.Classes.ProdutoClasse;
import merc.model.Endereco;
import merc.model.ItemCompra;
import merc.model.ItemPedido;
import merc.model.Produto;


/**
 *
 * @author bsbru
 */
public class ProdutoController {
    
    public Integer newProduto(String descricao,Integer valor_unitario, Integer qtde_estoque){
        

        
        ProdutoClasse pruduto = new ProdutoClasse();
        
        pruduto.setDescricao(descricao);
        pruduto.setValor_unitario(valor_unitario);
        pruduto.setQtde_estoque(qtde_estoque);
  
        
       
        Produto produtoModel =  new Produto();
        
        Integer insert = produtoModel.insert(pruduto);
        
        if(insert > 0){
            return insert;
        }else{
            return 0;
        }        
        
    }
    
    public  ArrayList<ProdutoClasse> select(){
        
            Produto produtoModel =  new Produto();
          ArrayList<ProdutoClasse> produtos = null;
          
          try{
             produtos = produtoModel.select();
             
        
            return produtos;
        
             
          }catch(Exception e){

          }
          
         return produtos;
        
        
    }
    
    public  ProdutoClasse selectById(Integer id){
        
            Produto produtoModel =  new Produto();
            ProdutoClasse produtos = null;
          
          try{
             produtos = produtoModel.selectById(id);
             
        
            return produtos;
        
             
          }catch(Exception e){

          }
          
         return produtos;
        
        
    }
    
        
    public ProdutoClasse update(ProdutoClasse produto){
        
              Produto produtoModel =  new Produto();
            
          
          try{
              
            ProdutoClasse update = produtoModel.update(produto);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return produto;
        
        
    }
    
    public boolean remove(ProdutoClasse produto){
        
         Produto produtoModel =  new Produto();
  
              
            boolean remove = produtoModel.remove(produto);
             
        
            return remove;
        
            
          
        
    }
    
        public ProdutoClasse decrementaQuantidade(ProdutoClasse produto){
        
              Produto produtoModel =  new Produto();
            
          
          try{
              
            ProdutoClasse update = produtoModel.decrementaQuantidade(produto);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return produto;
        
        
    }
        
                public ProdutoClasse incrementaQuantidade(ProdutoClasse produto){
        
              Produto produtoModel =  new Produto();
            
          
          try{
              
            ProdutoClasse update = produtoModel.incrementaQuantidade(produto);
             
        
            return update;
        
             
          }catch(Exception e){

          }
          
         return produto;
        
        
    }

    
}
